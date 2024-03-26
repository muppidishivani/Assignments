package com.web.java;

public class GameBoard_36 {
	
	    public static void main(String[] args) {
	        drawGameBoard(3, 3); 
	    }

	    public static void drawGameBoard(int rows, int cols) {
	        for (int i = 0; i < rows; i++) {
	            drawHorizontalLine(cols);
	            drawVerticalLine(cols);
	        }
	        drawHorizontalLine(cols); 
	    }

	    public static void drawHorizontalLine(int cols) {
	        for (int i = 0; i < cols; i++) {
	            System.out.print("+---");
	        }
	        System.out.println("+");
	    }

	    public static void drawVerticalLine(int cols) {
	        for (int i = 0; i < cols; i++) {
	            System.out.print("|   ");
	        }
	        System.out.println("|");
	    }
	}


