package com.syntax.clas6;

import java.util.Scanner;

public class AverageScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter your score for the quiz?");
double quiz=input.nextDouble();
System.out.println("Enter your score for the midterm?");
double midterm=input.nextDouble();
System.out.println("Enter your score for the final exam?");
double fexam=input.nextDouble();
double avg=(quiz+midterm+fexam)/3;
String score;
if(avg>=90)
score="A";
else if(avg>=70 &&  avg<90)
	score="B";
	else if(avg>=50 &&  avg<70)
		score="C";
	else if(avg<50)
		score="F";
	else
score="invalid";

System.out.println("!!!!!!!!!!!!OUTPUT!!!!!!!!!!!!!!!1");
System.out.println("Your grade is:=" +score);



	}

}
