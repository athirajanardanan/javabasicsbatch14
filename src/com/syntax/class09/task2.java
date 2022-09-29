package com.syntax.class09;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] result = {{"athira","Sarath","Saketh","Ash"},
                {"A","B","C","D"}

        };
		System.out.println("USing for  loop");
		//using for loop
		for(int r=0;r<result.length;r++)
		{
			for(int c=0;c<result[r].length;c++)
			{
				System.out.print(result[r][c]);
			}
				
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1");
		System.out.println("USing for each loop");
		//using for each loop
		for(String[] res:result)
		{
			for(String re:res)
			{
				System.out.print(re);
			}
		}
        System.out.println(result[0][0]+" has got '"+result[1][0]+"' grade.");
        System.out.println(result[0][1]+" has got '"+result[1][1]+"' grade. ");
        System.out.println(result[0][2]+" has got '"+result[1][2]+"' grade. ");
        System.out.println(result[0][3]+" has got '"+result[1][3]+"' grade. ");

	}
}


