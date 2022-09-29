package com.syntax.class11;

public class Dog {
	String name="JAcky";
	int age=4;
	String gender="Male";
	
	void bark()
	{
		System.out.println("It barks");
	}
	void eat()
	{
		System.out.println("Favourite hobby is eating");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1=new Dog();
		dog1.bark();
		dog1.eat();

	}

}
