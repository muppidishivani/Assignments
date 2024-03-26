package com.web.java;

public class KilometersToMeters_14 {

	 public static double kilometersToMeters(double kilometers) {
	        return kilometers * 1000; 
	    }

	    public static void main(String[] args) {
	        double kilometers = 5.0; 
	        double meters = kilometersToMeters(kilometers);
	        System.out.println(kilometers + " kilometers is equal to " + meters + " meters.");
	    }
}
