package com.web.java;

public class CalculateRatio_11 {

	public static double calculateRatio(double numerator,double denomenator)
	{
		if(denomenator!=0)
		{
			return numerator/denomenator;
		}
		else
		{
			
		}
		return Double.NaN;
	}
	public static void main(String[] args) {
	
		double ratio=calculateRatio(6,2);
		System.out.println("The ratio of numerator and denomenator="+ratio);
	}

}
