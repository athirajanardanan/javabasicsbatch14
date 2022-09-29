package com.syntax.class13;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter a string?");
String str=input.next();
//String str1="mom";

String revorder="";
for(int i=str.length()-1;i>=0;i--)
{
	revorder=revorder+str.charAt(i);
}

if(str.equalsIgnoreCase(revorder))
{
	System.out.println("Entered string is  pallindrome");
}
else
{
	System.out.println("Entered string is not pallindrome");
}
	}

}
