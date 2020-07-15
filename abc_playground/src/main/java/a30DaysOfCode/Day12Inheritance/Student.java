package a30DaysOfCode.Day12Inheritance;

public class Student extends Person {
    private int[] testScores;
    private char grade;

    Student(String firstName, String lastName, int identification, int[] scores) {
        super(firstName, lastName, identification);
        this.testScores = scores;
    }

    public char calculate() {
        int sum = 0;

        for (int i = 0; i < testScores.length; i++) {
            sum = sum +testScores[i];
        }
        double g = sum / testScores.length;
       // System.out.println(g + " that is the score");
        if (90 <= g && g <= 100)
            grade = 'O';
        if (80 <= g && g < 90)
            grade = 'E';
        if (70 <= g && g < 80)
            grade = 'A';
        if (55 <= g && g < 70)
            grade = 'P';
        if (40 <= g && g < 55)
            grade = 'D';
        if (g < 40)
            grade = 'T';

        return grade;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade)

    {
        this.grade = grade;
    }

    public int[] getTestScores() {
        return testScores;
    }
    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
}


