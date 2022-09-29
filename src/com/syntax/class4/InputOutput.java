package com.syntax.class4;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your name");
	
		String name=input.nextLine();
	
		System.out.println("Enter your age");
		
		int age=input.nextInt();
		System.out.println("~~~~~~~~~~~~~~~~OUTPUT~~~~~~~~~~~~~~~~~~~`");
	
		System.out.println("The given name is :="+name);
		System.out.println("The given age is :="+age);
		
	

	}

}
