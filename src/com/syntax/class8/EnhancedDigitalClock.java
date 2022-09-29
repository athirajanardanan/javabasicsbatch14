package com.syntax.class8;

public class EnhancedDigitalClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digital clock");
			for(int j=0;j<=9;j++)
			{
				for(int k=0;k<=5;k++)
				{
					for(int l=0;l<=9;l++)
					{
						System.out.println("0"+j+":"+k+l);
					}
				}
			}
		
		for(int hour=10;hour<=23;hour++)
		{
			
			for(int minute=0;minute<=59;minute++)
			{
				
	if(minute>9)
	{
		System.out.println(hour + ":" +minute);	
	}
	else if(minute<9)
			{
		System.out.println(hour + ":" +"0"+minute);
			}
					
				
			}
		}

	}

}
