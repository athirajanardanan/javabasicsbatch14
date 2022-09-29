package com.syntax.class4;

import java.util.Scanner;

public class TimeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the current time(Please use 24H format)");
		double time=input.nextDouble();
		System.out.println("!!!!!!!!!!!!OUTPUT!!!!!!!!!!!!!!!!!");
		if(time>=1 && time<=11)
			System.out.println("Its morning time.Have a coffee");
		
		if(time>=12 && time<=15)
			System.out.println("Its after noon time.Have your lunch");
		if(time>=16 && time<=20)
			System.out.println("Its evening time.Relax!!!!!!!");
		if(time>=21 && time<=24)
			System.out.println("Its night time.Go to bed");
	}

}
