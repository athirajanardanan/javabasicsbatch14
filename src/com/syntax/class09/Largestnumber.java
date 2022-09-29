package com.syntax.class09;

public class Largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//From an array of integer elements find the largest number.
		int[] numbers= {10,20,30,40};
		int largest=0;
		for(int i=0;i<numbers.length;i++)
		{
			if(largest<numbers[i])
			{
				largest=numbers[i];
			}
		}
		System.out.println("Largest number is := "+largest);
	}

}
