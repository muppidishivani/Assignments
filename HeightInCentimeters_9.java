package com.web.java;

public class HeightInCentimeters_9 {

	
		 public static double calculateHeightInCentimeters(int feet, int inches) {
		        final double INCHES_TO_CENTIMETERS = 2.54;
		        final double FEET_TO_INCHES = 12;

		        double totalInches = (feet * FEET_TO_INCHES) + inches;
		        double heightInCentimeters = totalInches * INCHES_TO_CENTIMETERS;
		        
		        return heightInCentimeters;
		    }

		    public static void main(String[] args) {
		        int feet = 5;
		        int inches = 11;
		        
		        double heightInCentimeters = calculateHeightInCentimeters(feet, inches);
		        System.out.println("Height: " + feet + " feet " + inches + " inches = " + heightInCentimeters + " centimeters");
		    }
}
