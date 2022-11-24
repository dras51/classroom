import student.Classroom;
import student.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the classroom program!!");

        Scanner scanner = new Scanner(System.in);
        Classroom classroom = new Classroom();

        String input = "";

        do {
            System.out.println("""
                    What would you like to do today?

                    1. Add Student
                    2. View all students
                    3. View single student
                    4. Remove a student
                    5. View students with grade greater than 5
                    6. View students with grade less than 5
                    7. Update students course
                    8. Update students grade

                    """);

            input = scanner.nextLine();

            switch (input) {
                case "quit":
                    System.out.println("Exiting application!!!");
                    break;
                case "1":
                    classroom.addStudent();
                    break;
                case "2":
                    classroom.viewAllStudents();
                    break;
                case "3":
                    classroom.viewStudent();
                    break;
                case "4":
                   classroom.removeStudent();
                    break;
                case "5":
                    classroom.gradesGreaterThan5();
                    break;
                case "6":
                    classroom.gradesLessThan5();
                    break;
                case "7":
                    classroom.updateStudentCourse();
                    break;
                case "8":
                    classroom.updateStudentsGrade();
                    break;
                default:
                    System.out.println("Please enter a valid option");
                    break;
            }
        }while(!input.equals("quit"));


    }
}
