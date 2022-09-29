package com.syntax.class4;

import java.util.Scanner;

public class Mortgage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the mortgage rate please?");
		int rate=input.nextInt();
		if(rate>4.5)
		{
			System.out.println("Bad Luck.Not going to buy a house!!!!!!!!");
		}
		else
		{
			System.out.println("I wil think about  buying a house");
			System.out.println("What is the price of the house?");
			int price=input.nextInt();
			
			if(price>200000)
			{
				System.out.println("Taking loan would be better");
				System.out.println("How much money would you like to take as a loan");
				int mortprice=input.nextInt();
				if(mortprice<=200000)
				{
					System.out.println("Congrats!!!!You are eligible to lend the money");
					System.out.println("Please enter your age?");
					int age=input.nextInt();
					if(age>18)
					{
						System.out.println("Can issue a driver license");
					}
					else
					{
						System.out.println("Try to get a learner's permit!!!!!!");
					}
				}
				else
				{
					System.out.println("Sorrry!!!!We cant approve that");
					
				}
				
			}
			else
			{
				System.out.println(" I have enough money to afford a house");
			}
		}

	}

}
