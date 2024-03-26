package com.web.java;

import java.util.Scanner;

public class AgeOfPerson_7 {
 
	public static void main(String args[])
	{
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the year of birth: ");
	        int birthYear = scanner.nextInt();

	      
	        int currentYear = java.time.Year.now().getValue();
             System.out.println(currentYear);
	       
	        int age = currentYear - birthYear;

	        System.out.println("The age of the person is: " + age + " years");

	        scanner.close();
	    }
	
	}

