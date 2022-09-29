package com.syntax.class8;

import java.util.Scanner;

public class secretnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int number;
		int secretnumber=5;
		System.out.println("!!!!!!!!!!!!!!!!!!Let us play!!!!!!!!!!!!!!!");
		do
		{
			System.out.println("Enter your number?Let me check whether it matches:)");
			number=input.nextInt();
			if(number==secretnumber)
			{
				System.out.println("You did it!!!!!1prediction is correct");
			}
			else
			{
				System.out.println("Better luck..You went wrong .Iam sorry");
			}
			
		}while(number!=secretnumber);
		

	}

}
