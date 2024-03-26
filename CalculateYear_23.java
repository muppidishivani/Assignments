package com.web.java;

import java.util.Scanner;

public class CalculateYear_23 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	      
	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();

	       
	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();

	       
	        int currentYear = java.time.Year.now().getValue();
	        int yearOfBirth = currentYear - age;
	        int yearTurn100 = yearOfBirth + 100;

	       
	        System.out.println("Hello, " + name + "!");
	        System.out.println("You will turn 100 years old in the year " + yearTurn100 + ".");

	        scanner.close();
	    }

	}


