package com.mycompany.practical_01;

public class Practical_01 {

    public static void main(String[] args) {
        // q01
        System.out.println("Hello World!");
        // q02
        System.out.println("My name is Kavindu");
        System.out.println("I am a software engineering undergraduate");
        // q03 (for loop)
        for (int i = 0; i < 5; i++) {
            System.out.println("Executing Loop " + i);
        }
        // q03 (while loop)
        int i = 0;
        while (i < 5) {
            System.out.println("Executing Loop " + i);
            i++;
        }
        // q04
        int[] numArray = {10, 20, 30, 40, 50};
        for (int x : numArray) {
            if (x == 30) {
                break;
            }
            System.out.println(x);
            System.out.println("\n");
        }
		/*
		result:
		10
		20
		I'm out of the loop now
		*/
		
		int[] numArray = {10, 20, 30, 40, 50};
        for (int x : numArray) {
            if (x == 30) {
                continue;
            }
            System.out.println(x);
            System.out.println("\n");
        }
		/*
		result:
		10
		20
		40
		50
		I'm out of the loop now
		*/
        System.out.println("I'm out of the loop now");
		
        // q05
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
		/* output: 
		Excellent
		*/
		char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
            case 'D':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
		/* output: 
		Excellent
		Your passed
		*/
		
        // q06
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            System.out.print(x);
            System.out.print(",");
        }
        System.out.println();
        String[] names = {"James", "Larry", "Tom", "Lacy"};
        for (String name : names) {
            System.out.print(name);
            System.out.print(",");
        }
    }
}
PART 02:

	1. b) super
	2. b) private
	3. b) Packages
	4. c) import pkg.*
	5. c) charAt()
	6. d) length()

PART 03:

	1. Real-world objects contain state and behavior.
	2. A software object's state is stored in instance variables. 
	3. A software object's behavior is exposed through methods.
	4. Hiding internal data from the outside world, and accessing it only through publicly exposed methods is known as data encapsulation.
	5. A blueprint for a software object is called a class.
	6. Common behavior can be defined in a superclass and inherited into a subclass using the extends keyword.
	7. A collection of methods with no implementation is called an interface.
	8. A namespace that organizes classes and interfaces by functionality is called a package.
	9. The term API stands for Application Programming Interface.