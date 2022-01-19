package edu.neumont;

public class Main {

    public static void main(String[] args) {
	// write your code

        String name = Console.getUserInput("Enter college name: ");

        College college = new College(name);
        college.run();
    }
}
