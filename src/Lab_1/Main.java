package Lab_1;

import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        {
            // Creating a Scanner object to collect input command
            Scanner input = new Scanner(System.in);

            // Creating an Course object and assign it to myCourse
            Class myCourse = new Class();

            // Display initial course name (null)
            System.out.printf("Initial name is: %s%n%n", myCourse.getCourseName());

            // prompt for and read name
            System.out.println("Please enter the course name: ");
            String theCourseName = input.nextLine();
            myCourse.setCourseName(theCourseName);

            // Display the stored Course Name
            System.out.printf("Course Name is: ");
            System.out.printf(myCourse.getCourseName());
        }
    }

}