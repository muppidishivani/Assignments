package com.web.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_25 {

	public static void main(String[] args) {
		  List<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(5);
	        numbers.add(3);
	        numbers.add(7);
	        numbers.add(2);
	        numbers.add(4);

	        System.out.println("Elements less than 5:");
	        for (Integer num : numbers) {
	            if (num < 5) {
	                System.out.println(num);
	            }
	        }

	}

}
