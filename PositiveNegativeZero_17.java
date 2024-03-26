package com.web.java;

import java.util.Scanner;

public class PositiveNegativeZero_17 {

	public static void main(String args[])
{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println("The given number is positive="+n);
		}
		else if(n<0)
		{
			System.out.println("The given number is negative="+n);
		}
		else
		{
			System.out.println("The given number is zero="+n);
		}
		sc.close();
}
}
