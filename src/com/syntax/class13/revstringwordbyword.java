package com.syntax.class13;

public class revstringwordbyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Java is a programming language";

String words[]=str.split(" ");
String revorder="";
String wholeString="";

for(int i=0;i<words.length;i++)
{
String word=words[i];
for(int j=word.length()-1;j>=0;j--)
{
	revorder=revorder+word.charAt(j);
}

}
System.out.print(" ");
wholeString=wholeString+revorder+ " ";
System.out.println("Actual string is:="+str);
	System.out.println("Reverse order of each word is:= "+wholeString);

	}
}
