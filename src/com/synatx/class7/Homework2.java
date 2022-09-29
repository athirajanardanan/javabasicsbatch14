package com.synatx.class7;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	double price=5;
	double price1;
	System.out.println("Hello,Welcome to our coffee shop");
	do
	{
		
		System.out.println("Please pay for your coffee?");
		price1=input.nextDouble();
		
		if(price1>price)
		{
			System.out.println("Please pay less");
		}
		else if(price1<price)
		{
			System.out.println("Please pay more");
		}
		else
		{
		System.out.println("You have entered the exact amount");
		System.out.println("!!!!!!!!!!!!!Enjoy your coffeee!!!!!!!!!!!!!");
		}
		
		
	}while(price1!=5);

	}
}
