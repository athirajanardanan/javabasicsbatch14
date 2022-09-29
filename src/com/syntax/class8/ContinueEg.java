package com.syntax.class8;

public class ContinueEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Numbers which are not divisible by 3");
		for(int i=1;i<=50;i++)
		{
			if(i%3==0)
			{
				continue;
			}
			else
			{
			
			System.out.print(i + " ");
			}
		}

	}

}
