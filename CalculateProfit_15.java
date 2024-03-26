package com.web.java;

public class CalculateProfit_15 {

	  public static double calculateProfit(double costPrice, double sellingPrice) {
	        return sellingPrice - costPrice;
	    }

	    public static void main(String[] args) {
	        double costPrice = 50.0; 
	        double sellingPrice = 70.0; 
	        double profit = calculateProfit(costPrice, sellingPrice);
	        System.out.println("Profit is: $" + profit);
	    }
}
