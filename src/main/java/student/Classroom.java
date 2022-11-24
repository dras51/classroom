package student;

import java.util.ArrayList;
import java.util.Scanner;

public class Classroom {
    //You application should be able to add students to the classroom
//View all students in the classroom
//View single student by name
//remove a student in the classroom
//view students with grade greater than 5
//view students with grade less than 5

    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);

    public void addStudent() {
        System.out.println("Adding new student!");
        System.out.println("Please enter student name: ");

        String name = scanner.nextLine();

        System.out.println("Please enter students grade: ");
        int grade = intScanner.nextInt();

        System.out.println("Please enter students course: ");
        String course = scanner.nextLine();

        Student student = new Student(name, grade, course);
        students.add(student);

        System.out.println("Student added succesfully");
    }

    public void viewAllStudents() {
        System.out.println("Viewing all students!!!");

        for(Student student: students) {
            System.out.println(student);
        }
    }

    public void viewStudent() {
        System.out.println("Please enter the name of student to view: ");

        String name = scanner.nextLine();
        for(Student student: students) {
            if(student.name.equals(name)) {
                System.out.println(student);
                return;
            }

        }

        System.out.println("Student not found!");
    }

    public void removeStudent() {
        System.out.println("Please enter the name of student to remove: ");

        String name = scanner.nextLine();

        for(Student student: students) {
            if(student.name.equals(name)) {
                students.remove(student);
                System.out.println("Student removed successfully.");
                return;
            }
        }

        System.out.println("Student not found!");
    }

    public void gradesLessThan5(){
        System.out.println("Viewing students with grades less than 5");

        for (Student student: students) {
            if(student.getGrade() < 5){
                System.out.println(student);
            }
        }
    }

    public void gradesGreaterThan5() {
        System.out.println("Viewing students with grades greater than 5");

        for (Student student: students) {
            if(student.getGrade() >= 5) {
                System.out.println(student);
            }
        }
    }

    public void updateStudentCourse() {
        //Find student by name, then update the student course with new course provided
        System.out.println("Please enter the name of student to update: ");
        String name = scanner.nextLine();

        System.out.println("Please enter the course you would like to change to");
        String course = scanner.nextLine();

        for (Student student: students) {
            if(student.name.equals(name)) {
                student.course = course;
                System.out.println("Students course has been updated!");
                return;
            }
        }

        System.out.println("Student not found!");
    }

    public void updateStudentsGrade() {
        System.out.println("Please enter the name of student to update: ");

        String name = scanner.nextLine();

        for(Student student: students) {
            if (student.name.equals(name)) {
                System.out.println("Please enter new grade(" + student.getGrade() + "): " );
                int grade = intScanner.nextInt();

                student.setGrade(grade);
                System.out.println("Students grade has been updated");
                return;
            }
        }

        System.out.println("Student not found!!");

    }
}


//    Create a supermarket inventory program that tracks products in the supermarket. your program should be able to perform the following tasks:
//
//        - [ ]  Add product
//        - [ ]  View all products
//        - [ ]  Remove a product
//        - [ ]  View single product
//        - [ ]  Buy a product (deducting the products quantity)