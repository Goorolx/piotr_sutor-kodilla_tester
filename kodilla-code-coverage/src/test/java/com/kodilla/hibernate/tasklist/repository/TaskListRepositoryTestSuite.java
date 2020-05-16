package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {


    @Autowired
    private TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "Test: Do Homework";
    private static final String LISTNAME = "Test: TaskList Homework";

    @Test
    public void testFindByListName() {
        //given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);

        taskListRepository.save(taskList);
        //when

        List<TaskList> readByName = taskListRepository.findByListName(LISTNAME);
        String readString = "";
        for (TaskList tasklist : readByName
        ) {
            String tl = taskList.getListName();
            readString += tl;
        }

        //then
        Assert.assertTrue(readString.contains("Test:"));

        //cleanup
        int id = taskList.getId();
        taskListRepository.deleteById(id);
    }

}