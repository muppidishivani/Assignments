package com.web.java;

public class FibonacciSeries_22 {

	public static void main(String[] args) {
		 int n = 10; 
	        int first = 0;
	        int second = 1;

	        System.out.println("First " + n + " Fibonacci numbers:");

	        System.out.print(first + " "); 

	        for (int i = 1; i < n; i++) {
	            System.out.print(second + " "); 

	            int next = first + second;
	            first = second;
	            second = next;
	        }
	    }

	}


