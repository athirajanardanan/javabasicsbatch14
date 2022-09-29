package com.syntax.class13;

import java.util.Arrays;

public class CountingSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] strSplit=str.split("[?]");
		int count=0;
		System.out.println("~~~~~~~~~~~~~Lines in this string~~~~~~~~~~~~~~~~");
		for(int i=0;i<strSplit.length;i++)
		{
			
			System.out.println(strSplit[i]);
		count=i+1;
		}
		
	System.out.println("Total number of sentences are :="+count);

	}

}
