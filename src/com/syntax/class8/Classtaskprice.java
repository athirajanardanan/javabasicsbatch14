package com.syntax.class8;

import java.util.Scanner;

public class Classtaskprice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
String item;
double price=50;
System.out.println("Welcome to our shop");
System.out.println("Enter the item you want to purchase");

item=input.nextLine();
System.out.println("Enter the amount please");
double amount=input.nextInt();

if(amount==price)
System.out.println("Thank you for shopping");
while(amount!=price)
{
	 if(amount>price)
	{
	double balance=amount-price;
	System.out.println("Please take your balance:= " +balance);
	System.out.println("!!!!!!!!Thank you.please do visit us again!!!!!!1");
	break;
	}
	 else
	 {
	System.out.println("Please pay more");
	System.out.println("Enter the amount again please?");
int newamount=input.nextInt();
	amount=amount+newamount;
	if(amount!=price)
	{
	continue;	
	}
	else
	{
		System.out.println("Finally you have entered the exact amount..");
		System.out.println("Thank you for shopping");
	}
}
	 
	 }

	
}

	


}
	


