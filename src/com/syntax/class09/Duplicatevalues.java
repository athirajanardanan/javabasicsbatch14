package com.syntax.class09;

public class Duplicatevalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] elements= {"cat","dog","cow","cat","elephant","rat","rabbit","rabbit","rat"};
		System.out.println("Duplicate values are:=");
		
		for(int i=0;i<elements.length;i++)
		{
			for(int j=i+1;j<elements.length;j++)
			{
				if(elements[i].equalsIgnoreCase(elements[j]))
				{
					System.out.println(elements[i]);
				}
			}
		}

	}

}
