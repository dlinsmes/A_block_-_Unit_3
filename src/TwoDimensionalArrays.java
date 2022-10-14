import java.util.Scanner;

public class TwoDimensionalArrays {
    public static void main(String [] args) {

        //think of a 2D array as an array filled with
        //smaller arrays
        int [][] numbers = {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12} };

        //first index is for the row you're referring to
        //second index is for the position within the row

        System.out.println("value at row 0, col 2: " + numbers[0][2]);
        System.out.println("value at row 2, col 0: " + numbers[2][0]);

        //length is the number of rows for 2d array
        System.out.println("length of numbers is " + numbers.length);

        //specify a row and find that row's length to get
        //the number of columns
        System.out.println("number of cols: " + numbers[0].length);

        //print the row with index 1
        System.out.println("row 1:");
        for(int i = 0; i < numbers[1].length; i++) {
            System.out.print(numbers[1][i] + " ");
        }
        System.out.println();

        //print column 0
        System.out.println("col 0:");
        for(int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i][0] + " ");
        System.out.println();

        System.out.println();

        //print whole 2d array as a table
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                System.out.print(numbers[i][j] + "\t");
                // "\t" is a tab character
                // for consistent spacing
            }
            System.out.println();
        }
        System.out.println();

        //same thing with for-each loops

        //outer loop iterates through each array (row) of the
        //2d array
        for (int [] row: numbers) {

            //inner loop iterates through each value
            //of the current row
            for (int n: row) {
                System.out.print(n + "\t");
            }
            System.out.println();
        }
        System.out.println();

        //use a for-each loop to print row 2
        System.out.println("row 2:");
        //numbers[2] refers to the whole array (row) with index 2 from the
        //2d array
        for(int n: numbers[2]) {
            System.out.print(n + " ");
        }
        System.out.println();

        String [] names  = {"fred", "alice", "joe"};
        String [] subjects = {"math", "science", "ap lunch", "computer science"};

        //2d array representing each person's grades in the given subjects
        //each row is a student
        //each col is a subject

        int [][] grades = new int[names.length][subjects.length];

        //ask the user for each student's different grades and save to grades array
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < names.length; i++) {
            for (int j = 0; j < subjects.length; j++) {

                System.out.println("What is " + names[i] +"'s grade in " +
                        subjects[j] +"?");
                int grade = s.nextInt();
//                int grade = 90;
                grades[i][j] = grade;

            }
        }

        //print table of grades
        for (int i = 0; i < grades.length; i++) {
            //names go here
            for (int j = 0; j < grades[0].length; j++) {
                System.out.print(grades[i][j] + "\t");
            }
            System.out.println();
        }
        //add labels: names on the left and subjects on the top
    }
}