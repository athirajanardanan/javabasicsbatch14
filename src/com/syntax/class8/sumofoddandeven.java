package com.syntax.class8;

public class sumofoddandeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oddsum=0;
		int evensum=0;
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				evensum=i+evensum;
				
			}
			if(i%2!=0)
			{
				oddsum=i+oddsum;
				
			}
		}
		System.out.println("!!!!!!!!!!!!!1OUTPUT!!!!!!!!!!!!!!!!");
		System.out.println("Sum of even numbers:= "+evensum);
		System.out.println("Sum of odd numbers:= "+oddsum);
	}

}
