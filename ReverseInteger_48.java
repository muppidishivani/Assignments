package com.web.java;

public class ReverseInteger_48 {

	
	    public static void main(String[] args) {
	        int number = 12345; 
	        
	        int reversedNumber = reverseInteger(number);
	        
	        System.out.println("Original number: " + number);
	        System.out.println("Reversed number: " + reversedNumber);
	    }
	    
	    public static int reverseInteger(int number) {
	        int reversedNumber = 0;
	        
	        while(number != 0) {
	            int digit = number % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            number /= 10;
	        }
	        
	        return reversedNumber;
	    }
	}


