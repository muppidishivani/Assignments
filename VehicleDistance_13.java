package com.web.java;

public class VehicleDistance_13 {
	 public static double calculateSpeed(double distance, double time) {
	       
	        if (time != 0) {
	            return distance / time;
	        } else {
	            
	            return Double.NaN;
	        }
	    }

	    public static void main(String[] args) {
	        double distance = 100; 
	        double time = 7;

	        double speed = calculateSpeed(distance, time);
	        System.out.println("Speed of the vehicle is: " + speed + " km/h");
}
}
