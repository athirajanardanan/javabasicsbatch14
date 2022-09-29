package com.syntax.class4;

public class IfNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=30;
		if(c>a)
		{
			if(c>b)
			{
				System.out.println(c+" is greatest number among them");
				
			}
		}
		else
		{
			System.out.println("~~~~~~~~");
		}
		String day="sunday";
		int time=9;
		if(day.equals("monday"))
			{
			if(time>=9)
			{
				System.out.println("~~~~Office time~~~~~~~~~");
			}
			}
		else
		{
			System.out.println("Relax");
		}

	}

}
