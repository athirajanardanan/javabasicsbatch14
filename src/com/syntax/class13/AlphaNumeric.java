package com.syntax.class13;

public class AlphaNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="AAAbbbbCccc 1234 &*%^$";
String newString=str.replaceAll("[^a-zA-Z0-9]","");
int alpchar=0;
for(int i=0;i<newString.length();i++)
{
alpchar=alpchar+1;	
}
System.out.println("Number of alphanumerics in this string:= "+alpchar);
}
}
	


