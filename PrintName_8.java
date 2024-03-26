package com.web.java;

import java.util.Scanner;

public class PrintName_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name str");
		String str = sc.next();
		for(int i=1;i<=10;i++)
		{
			System.out.println(str);
		}
		
          sc.close();
	}

}
