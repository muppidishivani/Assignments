package com.web.java;

import java.util.Scanner;

public class EvenNumber_24 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter a number: ");
	        long number = scanner.nextLong();

	       
	        if (number % 2 == 0) {
	            System.out.println("The number " + number + " is even.");
	        } else {
	            System.out.println("The number " + number + " is odd.");
	        }

	        scanner.close();
	    }
	

	}


