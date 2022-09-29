package com.syntax.class4;

import java.util.Scanner;

public class recapScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter your name?");
String name=input.next();
System.out.println("Enter your lastnema?");
String lastname=input.next();
System.out.println("Enter your grade?");
char g=input.next().charAt(0);
System.out.println("Enter your address?");
input.nextLine();
String add=input.nextLine();
System.out.println("Enter your age?");
int age=input.nextInt();

System.out.println("!!!!!!!!!!!!!!OUTPUT!!!!!!!!!!!!!!!!!!");
System.out.println("My first name is:= " +name +" and my last name is :="  +lastname);

System.out.println("Your grade is := " +g);
System.out.println(add);
if((age>1)&&(g>9))
	System.out.println("Eligible to do 10th");
else
	System.out.println("Sorry");
int a=100;
int b=200;
int c=300;
if(a>b && a>c)
{
	System.out.println(a+ "Is the largest");
}
else if(b>a && b>c)
{
	System.out.println(b+ "Is the largest");
}
else
{
	System.out.println(c+ "Is the largest");
}
boolean enjoy=true;
int money=20000;
if((enjoy) || (money>19999))
{
	System.out.println("Hurray");
	}
	}

}
