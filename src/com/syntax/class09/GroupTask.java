package com.syntax.class09;

import java.util.Scanner;

public class GroupTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of countries you want to store: ");  
		//reading the number of elements 
		n=sc.nextInt();  
		//creates an array in the memory of length specified by user 
		String[] array = new String[n];  
		System.out.println("Enter the countries of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		//reading array elements from the user   
		array[i]=sc.next();  
		}  
		String[] capitals= {"New delhi","Beijing","washington","Ottawa","Paris"};
		System.out.println("~~~~~~~~~~~~~OUTPUT~~~~~~~~~~~~~~~~~");
		
	}

}
