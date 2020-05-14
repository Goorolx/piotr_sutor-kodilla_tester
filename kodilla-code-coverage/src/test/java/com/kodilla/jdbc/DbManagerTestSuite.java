package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {

    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        String sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Zara', 'Ali')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Otman', 'Use')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Mark', 'Boq')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Uli', 'Wimer')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Oli', 'Kosiw')";
        statement.executeUpdate(sql);

        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        int expected = count + 5;
        Assert.assertEquals(expected, counter);

        rs.close();
        statement.close();
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
//Given
        DbManager dbManager = DbManager.getInstance();
        String moreThan2Query =
                "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER " +
                        "FROM USERS U " +
                        "JOIN POSTS P ON U.ID = P.USER_ID " +
                        "GROUP BY P.USER_ID " +
                        "HAVING COUNT(*) > 1;";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(moreThan2Query);

        int postsCount = 0;

        while (rs.next()) {
            int postsNumber = rs.getInt("POSTS_NUMBER");
            postsCount += postsNumber;
        }

        String addNewTestUser = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Test', 'User')";
        statement.executeUpdate(addNewTestUser);

        String selectTestUser = "SELECT ID, FIRSTNAME, LASTNAME FROM USERS WHERE FIRSTNAME = \"Test\"";
        ResultSet rsTestUser = statement.executeQuery(selectTestUser);
        int testUserID = 0;
        while (rsTestUser.next()) {
            testUserID = rsTestUser.getInt("ID");
        }

        //When
        String sql = "INSERT INTO POSTS (USER_ID, BODY) VALUES (" + testUserID + ", \"ToBeDeleted\");";
        statement.executeUpdate(sql);
        statement.executeUpdate(sql);

        rs = statement.executeQuery(moreThan2Query);

        //Then
        int postCounter = 0;
        while (rs.next()) {
            int postsNumber = rs.getInt("POSTS_NUMBER");
            System.out.println(postsNumber + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            postCounter = postCounter + postsNumber;
        }
        Assert.assertEquals(postsCount + 2, postCounter);
    }

    @Test
    public void shouldDeleteTestPostsAndTestUsers() throws SQLException {
        DbManager dbManager = DbManager.getInstance();
        String toDelete = "DELETE FROM POSTS WHERE BODY = \"ToBeDeleted\" ";
        String toDeleteUser = "DELETE FROM USERS WHERE FIRSTNAME = \"Test\" ";

        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(toDelete);
        statement.executeUpdate(toDeleteUser);

        String sqlQuery = "SELECT * FROM USERS WHERE FIRSTNAME = \"Test\" ";
        statement = dbManager.getConnection().createStatement();
        ResultSet rsDel = statement.executeQuery(sqlQuery);

        int counter = 0;
        while (rsDel.next()) {
            System.out.println(rsDel.getInt("ID") + ", " +
                    rsDel.getString("FIRSTNAME") + ", " +
                    rsDel.getString("LASTNAME"));
            counter++;
        }
          Assert.assertEquals(0,counter);
    }
}