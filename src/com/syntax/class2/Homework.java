package com.syntax.class2;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Todays homework for addition subtraction multiplication and division
		double number1=100;
		double number2=200;
	double	sum=number1+number2;
	double sub=number1-number2;
	double mult=number1*number2;
	double div=number1/number2;
	System.out.println("RESULTS");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("The sum of "+ number1+ number2 + " is equal to:=" + sum);
	System.out.println("The differenece of "+ number1+ number2 + " is equal to:=" + sub);
	System.out.println(number1 +" times "+ number2 + " is equal to:=" + mult);
	System.out.println(number1 +"divided by  " + number2 + "is equal to:= " + div);
	System.out.println("Finding the square of a number:");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	//square of a number
	double s=3.9;
	double sq=s*s;
	System.out.println("Square of " + s + "is" + sq);
	
	//area and perimeter 
	System.out.println("Finding area and perimeter");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	int width=10;
	int height=20;
	int area=width*height;
	int peri=2*(width+height);
	System.out.println("Perimeter of a rectangle with width " + width + "and height  " +  height + " is equal to:= " + peri);
	System.out.println("Area of a rectangle with width " + width + "and height  " +  height + " is equal to:= " + area);
	
	
	
	
	
	
	
	}

}
