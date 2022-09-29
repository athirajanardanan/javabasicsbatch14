package com.syntax.class09;

public class hwarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
		char[] lettersOfMyName= {'A','T','H','I','R','A'};
		System.out.println("Using for loop");
		System.out.print("Letters of my name is:= ");
		for(int i=0;i<lettersOfMyName.length;i++)
		{
			System.out.print(lettersOfMyName[i]);
			System.out.print(" ");
		}
		//Using for each loop
		System.out.println();
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("Using for each loop ");
		System.out.print("Letters of my name is:= ");
		for(char name:lettersOfMyName)
		{
			System.out.print(name);
		}
	}
}

