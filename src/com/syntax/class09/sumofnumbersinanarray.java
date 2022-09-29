package com.syntax.class09;

public class sumofnumbersinanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {10,20,30,40,50,60,70,80,90,100};
		int sum=0;
		System.out.print("Sum Of numbers in this array is:= ");
		for(int i=0;i<numbers.length;i++)
		{
			sum=sum+numbers[i];
			
		}
		System.out.print(sum);
	}

}
