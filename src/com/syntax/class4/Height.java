package com.syntax.class4;

import java.util.Scanner;

public class Height {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter your height in inch?");
int height=input.nextInt();
if(height<60)
	System.out.println("You are short");
else if(height>60 && height<72)
	System.out.println("You are medium");
else if(height>72)
	System.out.println("You are tall");
else
	System.out.println("Invalid");
	}

}
