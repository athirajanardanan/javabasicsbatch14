package com.syntax.class12;

public class revorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Athira";
		System.out.print("Reverse order of my name is:=");
		for(int i=(name.length()-1);i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}
		System.out.println();
		char[] charArray=name.toCharArray();
		for(int j=charArray.length-1;j>=0;j--)
		{
			System.out.print(charArray[j]+" ");
		}

	}

}
