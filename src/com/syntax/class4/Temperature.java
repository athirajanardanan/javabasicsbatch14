package com.syntax.class4;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String city;
		double temp;
		System.out.println("Enter your City?");
		city=input.next();
		System.out.println("Enter the curren temperature in farenheit?");
		temp=input.nextDouble();
		double newtemp=(temp-32)*.5556;
		System.out.println("!!!!!!!!!!!OUTPUT!!!!!!!!!!!!!!!!!!!");
		System.out.println("Temperature in the "+city+" is:="+newtemp);
		

	}

}
