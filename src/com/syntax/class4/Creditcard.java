package com.syntax.class4;

import java.util.Scanner;

public class Creditcard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		Boolean Iscredit;
		System.out.println("Do you have a credit card?(Say true or false)");
		Iscredit=input.nextBoolean();
		if(Iscredit)
		{
			System.out.println("Can you enter the balance in your card?");
			int balance=input.nextInt();
			if(balance<1000)
			{
				System.out.println("Please pay off immediately");
			}
			else
			{
				System.out.println("Hurray...You can spend more!!!!!!!!!!!!");
			}
		}
		else
		{
			System.out.println("You are eligible to take a creidt card");
		}

	}

}
