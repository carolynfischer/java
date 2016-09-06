
package inheritance;

import java.util.Arrays;

class Student extends Person {
    private int[] testScores;
    private String firstName;
    private String lastName;
    private int identification;
    
    public Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }
    
    public char calculate() {
        int avg = 0;
        char grade;

        int[] grades = this.testScores;
        for (int i = 0; i < grades.length; i++) {
            avg += grades[i];
        }
        avg = avg / grades.length;
        if (avg >= 90 && avg <= 100) {
            grade = 'O';
        } else if (avg >= 80 && avg < 90) {
            grade = 'E';
        } else if (avg >= 70 && avg < 80) {
            grade = 'A';
        } else if (avg >= 55 && avg < 80) {
            grade = 'P';
        } else if (avg >= 40 && avg < 55) {
            grade = 'D';
        } else {
            grade = 'T';
        }
        return grade;
    }
   
}