package edu.neumont;

import java.util.ArrayList;

public class Staff extends Person{

    private String jobTitle;
    private ArrayList<Student> students = new ArrayList<>();

    public Staff(String name, int dob, String jobTitle) {
        super(name, dob);
        this.jobTitle = jobTitle;
    }

    public Staff(String name, int dob, String jobTitle, ArrayList<Student> students) {
        super(name, dob);
        this.jobTitle = jobTitle;
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return name + " (" + jobTitle + ")";
    }
}
