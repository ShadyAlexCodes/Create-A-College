package edu.neumont;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private final ArrayList<Student> students = new ArrayList<>();
    private Faculty instructor;

    public Course() {

    }

    public Course(String courseName, Faculty instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public Course(Faculty instructor) {
        this.instructor = instructor;
    }

    public Faculty getInstructor() {
        return instructor;
    }

    public void setInstructor(Faculty instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", students=" + students +
                ", instructor=" + instructor.name +
                '}';
    }
}
