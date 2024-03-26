package com.web.java;

public class AmstrongNumber_41 {

	public static void main(String args[])
	{
		int n=153;
		int temp=n,count=0;
		int temp1=n,sum=0;
		while(temp>0)
		{
			
			int rem=temp%10;
			count++;
			temp=temp/10;
			}
		
		while(temp1>0)
		{
			
			int r=temp1%10;
			
			int x=1;
			int y=count;
			while(y>0)
			{
				x=x*r;
				
				y--;
			}
			sum=sum+x;
		     temp1=temp1/10;
		}
		if(sum==n)
		{
			System.out.println("The number is amstrong number="+sum);
		}
		else
		{
			System.out.println("The number is not a amstrong number="+sum);
		}
	}
}
