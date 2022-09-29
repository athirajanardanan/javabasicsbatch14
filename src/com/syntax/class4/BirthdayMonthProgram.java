package com.syntax.class4;

import java.util.Scanner;

public class BirthdayMonthProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String season=null;
		System.out.println("Enter your birth month?");
	  String month=input.next();
		if(month.equals("april") || month.equals("may")|| month.equals("march"))
		season="spring";
		else if(month.equals("june") || month.equals("july")|| month.equals("august"))
			season="summer";
		else if(month.equals("september") || month.equals("october")|| month.equals("november"))
			season="fall";
		else if(month.equals("december") || month.equals("january")|| month.equals("february"))
			season="winter";
		else
		{
			System.out.println("Invalid entry");
			season="invalid";
		}
		
		System.out.println(season);

	}

}
