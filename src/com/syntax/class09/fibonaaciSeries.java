package com.syntax.class09;

public class fibonaaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.print("Fibonacci series of "+i+" is:=");
			for(int j=0;j<10;j++)
			{
				if(j==0)
				{
					System.out.print(1*1+" ");
				}
				else
				{
					System.out.print(i*j+ " ");
				}
			}
			System.out.println();
		}

	}

}
