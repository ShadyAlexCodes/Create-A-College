package edu.neumont;

import java.util.ArrayList;

public class Student extends Person {

    private double gpa;
    private Staff staff;
    private ArrayList<Course> courses = new ArrayList<>();

    public Student(String name, int dob, double gpa, Staff staff, ArrayList<Course> courses) {
        super(name, dob);
        this.gpa = gpa;
        this.staff = staff;
        this.courses = courses;
    }


    public Student(String name, int dob, double gpa, Staff staff) {
        super(name, dob);
        this.gpa = gpa;
        this.staff = staff;
    }


    public Student(String name, int dob, double gpa) {
        super(name, dob);
        this.gpa = gpa;
        this.staff = staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", gpa=" + gpa +
                ", staff=" + staff +
                ", courses=" + courses +
                '}';
    }
}
