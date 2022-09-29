package com.syntax.class4;

import java.util.Scanner;

public class BooleanInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Did you start doing your your homeworks??");
boolean Iscomplete=input.nextBoolean();

if(Iscomplete)
{
	System.out.println("how many aasignments did you complete?");
	int assignment=input.nextInt();

	if(assignment>=17)
	{
	System.out.println("You are doing good!!!!!congratulations");
	
}
	else if(assignment>=12)
	{
		System.out.println("Try to do more!!!!!!!!");
	}
	else
	{
		System.out.println("You should work hard");
		
	}
}
	
else
{
	System.out.println("Please complete it as soon as possible..They are very important");
}
	}

}
