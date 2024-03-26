package com.web.java;

import java.util.Scanner;

public class WeekIntoMinute_5 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of weeks: ");
	        int weeks = scanner.nextInt();

	        int minutesInWeek = 7 * 24 * 60;
	        int totalMinutes = weeks * minutesInWeek;

	        System.out.println(weeks + " weeks is equal to " + totalMinutes + " minutes.");
	        
	        scanner.close();
	    }
	}


