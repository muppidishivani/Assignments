package com.web.java;

import java.util.Scanner;

public class YearToWeek_6 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of years: ");
	        int years = scanner.nextInt();

	        int weeksInYear = 52; 
	        int totalWeeks = years * weeksInYear;

	        System.out.println(years + " years is equal to " + totalWeeks + " weeks.");

	        scanner.close();
	}

}
