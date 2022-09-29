package com.syntax.class4;

import java.util.Scanner;

public class DiplomaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		boolean Isdiploma;
		System.out.println("Do you have a diploma?(Say true or false)");
		Isdiploma=input.nextBoolean();
		if(Isdiploma)
		{
			System.out.println("Congratulations!!!!!!!!!!!!!");
			
			System.out.println("Enter your GPA score");
			int gpa=input.nextInt();
			if(gpa>=3.5)
			{
				System.out.println("You are eligible for higher studies");
			}
			else
			{
				System.out.println("You should have studied harder.SORRY!!!!!!!!!!!!!!");
			}
			
		}
		else
		{
			System.out.println("No worries!!!!!You can do it..Please try to get a dregree");
		}
		
		

	}

}
