package edu.neumont;

public class Person {

    protected String name;
    protected int dob;

    public Person(String name, int dob) {
        this.name = name;
        this.dob = dob;
    }

    public Person() {
    }

    public boolean compareName(String name) {
        return this.name.equalsIgnoreCase(name);
    }

}
