package com.syntax.clas6;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter two numbers of our choice?");
int num1=input.nextInt();
int num2=input.nextInt();
System.out.println("What kind of operation you wanna do with these 2 numbers?");
char opr=input.next().charAt(0);
int result=0;

if(opr=='+')
result=num1+num2;
else if(opr=='-')
	result=num1-num2;
else if(opr=='*')
	result=num1*num2;
else if(opr=='/')
	result=num1/num2;
else
	System.out.println("Invalid operator");
if(opr=='+' ||opr=='-' || opr=='*'|| opr=='*')
{
System.out.println("!!!!!!!!!!!!!!!!OUTPUT!!!!!!!!!!!!!!!!!!!!");
System.out.println("Your calculator is ready");
System.out.println("The given numbers are :=" +num1 +"," +num2 +" and the given operator is :="+ "(" +opr +")");
System.out.println("Here comes the result");
System.out.println( "The result is :=" +result);
}
	
	

	}

}
