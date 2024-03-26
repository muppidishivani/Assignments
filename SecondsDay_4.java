package com.web.java;

public class SecondsDay_4 {
	 public static void main(String[] args) {
	        int secondsInDay = calculateSecondsInDay();
	        System.out.println("Total seconds in a day: " + secondsInDay);
	    }

	    public static int calculateSecondsInDay() {
	        int hoursInDay = 24;
	        int minutesInHour = 60;
	        int secondsInMinute = 60;

	        int totalSecondsInDay = hoursInDay * minutesInHour * secondsInMinute;
	        return totalSecondsInDay;
	    }
}
