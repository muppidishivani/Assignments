package com.web.java;

import java.util.Scanner;

public class PerimeterOfTriangle_19 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the length of side 1: ");
	        double side1 = scanner.nextDouble();

	        System.out.println("Enter the length of side 2: ");
	        double side2 = scanner.nextDouble();

	        System.out.println("Enter the length of side 3: ");
	        double side3 = scanner.nextDouble();

	       
	        double perimeter = calculatePerimeter(side1, side2, side3);

	        System.out.println("The perimeter of the triangle is: " + perimeter);

	        scanner.close();
	    }

	    public static double calculatePerimeter(double side1, double side2, double side3) {
	        return side1 + side2 + side3;
	    }

	}


