package com.syntax.class09;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {100,50,60,70,55};
		int largest=numbers[0];
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]>largest)
			{
				largest=numbers[i];			}
		}

	}

}
