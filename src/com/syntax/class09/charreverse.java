package com.syntax.class09;

public class charreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array to store char values and then print those in reverse order
		char ch[]= {'A','B','C','D','E','F'};
		System.out.print("Characters in reverse order:= ");
		for(int i=(ch.length-1);i>0;i--)
		{
			System.out.print(ch[i]);
			System.out.print(" ");
		}
				}

}
