package com.syntax.clas6;

import java.util.Scanner;

public class Switchgrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter your grade please???(use capital case please)");
char grade=input.next().charAt(0);
String info;
switch(grade)
{
case 'A':
	info="Excellent";
	break;
case 'B':
	info="Good";
	break;
case 'C':
	info="Average";
	break;
case 'D':
	info="Bad";
	break;
	default:
		info="inputting a invalid grade";
		break;
}
System.out.println("!!!!!!!!!!!!!!!!!OUTPUT!!!!!!!!!!!!!!!!!!");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("The grade you entered is :=" +grade +" ,and you are " +info);

	}

}
