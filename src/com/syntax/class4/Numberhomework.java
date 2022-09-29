package com.syntax.class4;

import java.util.Scanner;

public class Numberhomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number?");
		int num=input.nextInt();
		if(num>=1 && num<=10)
			System.out.println("The number you entered is small");
		else if(num>10 && num<100)
			System.out.println("The number you entered is medium");
		else if(num>100 && num<1000)
			System.out.println("The number you entered is large");

	}

}
