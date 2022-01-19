package edu.neumont;

import java.util.ArrayList;

public class College {

    private final ArrayList<Faculty> faculty = new ArrayList<>();
    private final ArrayList<Student> students = new ArrayList<>();
    private final ArrayList<Staff> staff = new ArrayList<>();
    private final ArrayList<Course> courses = new ArrayList<>();
    private String name;

    public College(String name) {
        this.name = name;
    }

    public College() {

    }


    public void run() {

        boolean quit = false;

        while (!quit) {
            System.out.println("-----------------------------");
            System.out.println(" ");
            System.out.println("(1) Add");
            System.out.println("(2) Remove");
            System.out.println("(3) View");
            System.out.println("(4) Quit");
            System.out.println(" ");
            System.out.println("-----------------------------");

            int selection = Console.getInteger("Enter selection: ");

            switch (selection) {
                case 1:
                    add();
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                    view();
                    break;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid selection... ");
            }
        }
    }

    private void add() {

        int type = getPersonType();
        String name = Console.getUserInput("Enter their name: ");
        int dob = Console.getInteger("Enter their year of birth: ");

        switch (type) {
            case 1:
                // User input
                double GPA = Console.getFloat("Enter the students GPA");
                students.add(new Student(name, dob, GPA, null));
                break;
            case 2:
                // User input
                int officeNumber = Console.getInteger("Enter office number: ");
                int officeHours = Console.getInteger("Enter office hours: ");
                boolean fulltime = Console.getUserInput("Fulltime (y/n): ").equalsIgnoreCase("y");
                faculty.add(new Faculty(name, dob, officeNumber, officeHours, fulltime));
                break;
            case 3:
                // User input
                String jobTitle = Console.getUserInput("Enter job title: ");
                staff.add(new Staff(name, dob, jobTitle));
                break;
        }

    }

    private void remove() {

        int type = getPersonType();

        String name = Console.getUserInput("Enter name: ");

        switch (type) {
            case 1:
                for (Student student : students) {
                    if (student.compareName(name)) {
                        this.students.remove(student);
                        System.out.println(name + " has been removed!");
                        break;
                    } else {
                        System.out.println(name + " was not found!");
                        break;
                    }
                }
                break;
            case 2:
                for (Faculty faculty : faculty) {
                    if (faculty.compareName(name)) {
                        this.faculty.remove(faculty);
                        System.out.println(name + " has been removed!");
                        break;
                    } else {
                        System.out.println(name + " was not found!");
                        break;
                    }
                }
                break;
            case 3:
                for (Staff staff : staff) {
                    if (staff.compareName(name)) {
                        this.staff.remove(staff);
                        System.out.println(name + " has been removed!");
                        break;
                    } else {
                        System.out.println(name + " was not found!");
                        break;
                    }
                }
                break;
        }

    }

    private void view() {
        int type = getPersonType();

        switch (type) {
            case 1:
                for (Student student : students) {
                    System.out.println(student);
                }
                break;
            case 2:
                for (Faculty faculty : faculty) {
                    System.out.println(faculty);
                }
                break;
            case 3:
                for (Staff staff : staff) {
                    System.out.println(staff);
                }
                break;
        }
    }

    private int getPersonType() {
        System.out.println("-----------------------------");
        System.out.println(" ");
        System.out.println("(1) Student");
        System.out.println("(2) Faculty");
        System.out.println("(3) Staff");
        System.out.println(" ");
        System.out.println("-----------------------------");

        return Console.getInteger("Enter selection: ");
    }
/*

    public void createCollege() {
        staff.add(new Staff("Reed", 1989, "President"));
        staff.add(new Staff("Canter", 1994, "HR"));
        staff.add(new Staff("Ellie", 1992, "Advocate"));

        faculty.add(new Faculty("Maple", 1999, 323, 2, true));
        faculty.add(new Faculty("Maple",  1943, 316, 4, false));


        courses.add(new Course("CSC150", faculty.get(0)));
        courses.add(new Course("BIT150", faculty.get(1)));

        students.add(new Student("Xander", 2003, 4.0, staff.get(3)));
        students.add(new Student("Karlo", 2002, 3.92, staff.get(1)));
        students.add(new Student("Michael", 2003, 2.3, staff.get(3)));

        courses.get(0).addStudent(students.get(0));
        courses.get(0).addStudent(students.get(1));
        courses.get(1).addStudent(students.get(2));

        faculty.get(0).addCourse(courses.get(0));
        faculty.get(1).addCourse(courses.get(1));




        for(Course course : courses) {
            System.out.println(course);
        }
    }*/

}
