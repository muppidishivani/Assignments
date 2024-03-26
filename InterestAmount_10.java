package com.web.java;

import java.util.Scanner;

public class InterestAmount_10 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the loanAmount");
		double loanAmount=sc.nextDouble();
		System.out.println("enter the rate of interest");
		double roi=sc.nextDouble();
	System.out.println("enter the time period");
	double timePeriod=sc.nextDouble();
	double InterestAmount=loanAmount* roi*timePeriod/100;
	System.out.println("The Interest Amount="+InterestAmount);
		
	sc.close();
	}
}
