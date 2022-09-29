package com.synatx.class7;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String ans;
		// TODO Auto-generated method stub
		do
		{
			System.out.println("Did you get a job?");
			 ans=input.nextLine();
		} while(!ans.equals("yes"));
System.out.println("~~~~~~~~~~~~~~~~~Congrats~~~~~~~~~~~~~~~~~`");
	}

}
