package com.syntax.class09;

public class ArrayOfAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.
String[] Animals= {"Elephant","Dog","Cat","Cow","Lion"};
System.out.println("Animals printing using for loop");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
for(int i=0;i<Animals.length;i++)
{
	System.out.print(Animals[i]);
	System.out.print(" ");
}
System.out.println();
System.out.println("Animals printing for each loop");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
for(String animal:Animals)
{
	System.out.print(animal);
	System.out.print(" ");
}
	}

}
