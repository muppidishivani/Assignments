package com.web.java;

public class PickWord_47 {

	    public static void main(String[] args) {
	    	 String[] words = {"apple", "banana", "orange", "grape", "kiwi"};
	         String randomWord = pickRandomWord(words);
	         System.out.println("Randomly picked word: " + randomWord);
	     }

	     public static String pickRandomWord(String[] words) {
	         
	         long currentTime = System.currentTimeMillis();

	        
	         int index = (int) (currentTime % words.length);

	        
	         return words[index];
	     }
	}

