package com.syntax.class09;

public class identifyoddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numbers= {10,20,30,40,50,60,70,80,90,100};
int largest=0;
for(int i=0;i<numbers.length;i++)
{
	for(int j=i+1;j<numbers.length;j++)
	{
	if(numbers[i]>largest)
	{
		largest=numbers[i];
		System.out.println(numbers[i]);
	}
	else if(numbers[i]<largest&&numbers[i]<numbers[j])
	{
System.out.println("Second largest is:="+numbers[j]);
	}

}
}
	}
}
