package com.web.java;

public class LargestThree_35 {
	
	    public static void main(String[] args) {
	        int num1 = 10;
	        int num2 = 25;
	        int num3 = 15;

	        int largest = findLargest(num1, num2, num3);
	        System.out.println("The largest number is: " + largest);
	    }

	    public static int findLargest(int a, int b, int c) {
	        int largest = a;

	        if (b > largest) {
	            largest = b;
	        }

	        if (c > largest) {
	            largest = c;
	        }

	        return largest;
	    }
	}

