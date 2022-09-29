package com.syntax.clas6;

import java.util.Scanner;

public class ClassSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the day?");
		int day=input.nextInt();
		short s=7;
		double discount=0.0;
		int da=7;
		switch(da)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tay");
			break;
		}
		float fl=3.5f;
		if(fl==3.5)
		{
			System.out.println("Equal");
		}
	System.out.println("Enter the character variable?");
	char ch=input.next().charAt(0);
		switch(ch)
		{
		case 'A':
			discount=0.2;
			break;
			
			
		}
		System.out.println(discount);
		switch(day)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tueday");	
			break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
				default:
					System.out.println("Invalid");
					break;
		}
switch(s)
{
case 7:
	System.out.println("7");
	break;
	default:
		System.out.println("Default");
		break;
}
	}

}
