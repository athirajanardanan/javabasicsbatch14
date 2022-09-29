package com.syntax.class09;

public class humtask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a 2D array of integer values. Print the sum of
	//	all numbers.
		int[][] numbers= {{10,20,30,40},
				{55,65,78,100}
		};
		int sum=0;
for(int num[]:numbers)
{
	for(int n:num)
	{
		sum=sum+n;
	}
}
System.out.println(sum);
	}

}
