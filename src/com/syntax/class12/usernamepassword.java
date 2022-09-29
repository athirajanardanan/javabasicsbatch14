package com.syntax.class12;

public class usernamepassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String userName="athira";
String pwd="athsaketh123";
String confirmpwd="athsaketh123";
if(userName.isEmpty()||pwd.isEmpty())
{
	System.out.println("!!!!!!!!!!!!!User name and password can not be empty!!!!!!!");
	
}
else if(pwd.length()<8)
{
	System.out.println("Password is too short");
}
else if(pwd.contains(userName))
	
{
	System.out.println("Password can not contain username");
}
else if(!pwd.equals(confirmpwd))
{
	System.out.println("Password does not match");
}
else
{
	System.out.println("User name and passwpord match..Good to go");
}
	}

}
