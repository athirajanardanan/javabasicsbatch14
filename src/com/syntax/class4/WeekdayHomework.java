package com.syntax.class4;

import java.util.Scanner;

public class WeekdayHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner input=new Scanner(System.in);
System.out.println("Enter the day?");
int day=input.nextInt();
if(day>=1 && day<=5)
	System.out.println("Its a weekday.Go to work");
else if((day==6) || (day==7))
	System.out.println("Its a weekend..Go for a movie!!!!!");
else
	System.out.println("Invalid");
String a="athira";
System.out.println(a.toUpperCase());
	
	}

}
