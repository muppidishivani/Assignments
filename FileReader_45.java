package com.web.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileReader_45 {
	 public static void main(String[] args) {
	        // Specify the file path
	        String filePath = "example.txt";

	        try {
	           
	            FileReader fileReader = new FileReader(filePath);

	           
	            BufferedReader reader = new BufferedReader(fileReader);

	            
	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }

	            
	            reader.close();
	            fileReader.close();
	        } catch (IOException e) {
	            System.out.println("An error occurred while reading from the file: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }
	}

