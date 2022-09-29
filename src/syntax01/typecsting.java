package syntax01;

import java.util.Scanner;

public class typecsting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
byte b1=23;
short s=129;
b1=(byte)s;
System.out.println(b1);
String name="athira";
System.out.println(name);
Scanner scan=new Scanner(System.in);
System.out.println("Enter your last name");
char n=scan.next().charAt(2);
System.out.println(n);
System.out.println("Enter your first name");
System.out.println();
char f=scan.next().charAt(2);
System.out.println(f);
int age=20;
String sex="female";


if(age>18)
{
if(sex.equals("male"))

	System.out.println("Driving");

else

	System.out.println("School");

}

	}

}