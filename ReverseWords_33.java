package com.web.java;

import java.util.Scanner;

public class ReverseWords_33 {
	public static void main(String args[])
	{
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a long string containing multiple words:");
	        String input = scanner.nextLine();

	        String reversedWords = reverseWords(input);
	        System.out.println("Reversed string with words in backwards order:"+reversedWords);
	        System.out.println(reversedWords);
	    }

	    public static String reverseWords(String input) {
	        String[] words = input.split("\\s+");
	        StringBuilder reversed = new StringBuilder();

	        for (int i = words.length - 1; i >= 0; i--) {
	            reversed.append(words[i]);
	            if (i > 0) {
	                reversed.append(" ");
	            }
	        }

	        return reversed.toString();
	    }
	    
	        
}

