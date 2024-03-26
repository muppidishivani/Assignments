package com.web.java;

import java.util.Scanner;

public class VowelOrConsonant_40 {

	public static void main(String args[])
	{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the character:");
	char ch=sc.next().charAt(0);
	
	if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') ||(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
		{
		   System.out.println("entered the character is vowel="+ch);
		}
     	else
	     {
		System.out.println("entered the character is consonant="+ch);
		
	      }
	
}
}
