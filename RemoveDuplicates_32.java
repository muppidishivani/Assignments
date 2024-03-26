package com.web.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates_32 {

	public static void main(String[] args) {
		 List<Integer> originalList = new ArrayList<>();
	        originalList.add(1);
	        originalList.add(2);
	        originalList.add(3);
	        originalList.add(2);
	        originalList.add(4);
	        originalList.add(3);
	        
	        List<Integer> uniqueList = removeDuplicates(originalList);
	        System.out.println("Original list: " + originalList);
	        System.out.println("List with duplicates removed: " + uniqueList);
	    }
	    
	    public static List<Integer> removeDuplicates(List<Integer> inputList) {
	        Set<Integer> set = new HashSet<>(inputList);
	        return new ArrayList<>(set);
	    }
	
	}


