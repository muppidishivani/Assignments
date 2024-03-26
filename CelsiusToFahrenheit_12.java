package com.web.java;

public class CelsiusToFahrenheit_12 {

		public static double celsiusToFahrenheit(double celsius)
		{
			return (celsius*9/5)+32;
		}
		public static void main(String args[])
		{
			double fahrenheit=celsiusToFahrenheit(10);
			System.out.println("The temperature in Fahrenheit="+fahrenheit	);
		}
	}


