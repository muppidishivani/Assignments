package com.web.java;

import java.util.Scanner;

public class AscendingOrder_21 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        int[] numbers = new int[5];

	        System.out.println("Enter 5 numbers:");

	       
	        for (int i = 0; i < 5; i++) {
	            numbers[i] = scanner.nextInt();
	        }

	        
	        for (int i = 0; i < 5; i++) {
	            for (int j = i + 1; j < 5; j++) {
	                if (numbers[i] > numbers[j]) {
	                    int temp = numbers[i];
	                    numbers[i] = numbers[j];
	                    numbers[j] = temp;
	                }
	            }
	        }

	        // Print numbers in ascending order
	        System.out.println("Numbers in ascending order:");
	        for (int i = 0; i < 5; i++) {
	            System.out.print(numbers[i] + " ");
	        }

	        scanner.close();
	    }
	
	}


