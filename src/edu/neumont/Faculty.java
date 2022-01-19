package edu.neumont;

import java.util.ArrayList;

public class Faculty extends Person {

    private int officeNumber;
    private int officeHours;
    private boolean fulltime;
    private ArrayList<Course> courses = new ArrayList<>();

    public Faculty() {

    }

    public Faculty(String name, int dob, int officeNumber, int officeHours, boolean fulltime) {
        super(name, dob);
        this.officeNumber = officeNumber;
        this.officeHours = officeHours;
        this.fulltime = fulltime;
    }

    public Faculty(String name, int dob, int officeNumber, int officeHours, ArrayList<Course> courses) {
        super(name, dob);
        this.officeNumber = officeNumber;
        this.officeHours = officeHours;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "officeNumber=" + officeNumber +
                ", officeHours=" + officeHours +
                ", fulltime=" + fulltime +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public Integer getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }
}
