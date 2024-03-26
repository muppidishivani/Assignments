package com.web.java;

import java.util.ArrayList;
import java.util.List;

public class List_31 {

	public static void main(String[] args) {
		 List<Integer> numbers = new ArrayList<>();
	        numbers.add(5);
	        numbers.add(10);
	        numbers.add(15);
	        numbers.add(20);
	        numbers.add(25);
	        
	        List<Integer> result = getFirstAndLast(numbers);
	        System.out.println("Original list: " + numbers);
	        System.out.println("List with only the first and last elements: " + result);
	    }
	    
	    public static List<Integer> getFirstAndLast(List<Integer> inputList) {
	        List<Integer> result = new ArrayList<>();
	        if (inputList.size() >= 2) {
	            result.add(inputList.get(0));
	            result.add(inputList.get(inputList.size() - 1)); 
	        } else {
	            System.out.println("List should contain at least two elements.");
	        }
	        return result;
	}

}
