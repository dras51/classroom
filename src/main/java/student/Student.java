package student;

public class Student {
    //Name, Grade, Course
    public String name;
    private int grade;
    public String course;

    public Student(String name, int grade, String course) {
        this.name = name;
        this.grade = grade;
        this.course = course;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String toString() {
        return "Name: " + name + ", Grade: " + grade + ", Course: " + course;
    }
}
