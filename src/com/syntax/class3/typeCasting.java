package com.syntax.class3;

public class typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName="Athira";
		String lastName="Janardanan";
		String phno="(613) 323 4542";

		System.out.println(firstName+" "+ lastName);
		System.out.println("diff :=" +(10-5));
		System.out.println();
		int a=11;
		int b=2;
		double d=a/b;
		int num10=100;
		long ll=340000;
		num10=(int)ll;
		System.out.println(num10);
		System.out.println(d);
	byte by=44;
	short s=20000;
	by=(byte) s;
	System.out.println(by);
	if(a>b)
	{
		System.out.println(a+" is greater than "+b);
	}
	boolean haveEnoughmoney=true;
	if (haveEnoughmoney)
	{
		System.out.println("Shopping");
	
		}
	else
	{
		System.out.println("Stay home");
	}
	int num=10;
	int num2=20;
	if(num>num2)
	{
		System.out.println(num>num2);
	}
	boolean ishungry=false;
	if(ishungry)
	{
		System.out.println("eat");
		
	}
	else
		{
		System.out.println("Sleep");
		}
	int num5=10;
	int num6=10;
	if(num5==num6)
	{
		System.out.println("same");
	}
	int day=6;
	if(day==1)
	{
		System.out.println("monday");
		
	}
	else if(day==2)
	{
		
		System.out.println("Tuesday");
		
	}
	else if(day==3)
	{
		System.out.println("Wednesday");
	}
	else if(day==4)
	{
		System.out.println("Thursday");
	}
	else if(day==5)
	{
		System.out.println("Friday");
	}
	else if(day==6)
	{
		System.out.println("Saturday");
	}
	else if(day==7)
	{
		System.out.println("sunday");
	}
	else
	{
		System.out.println("Enter a vaild number");
	}
	
if(firstName.equals("Athira"))
{
	System.out.println("correct name");
}
	}

}
