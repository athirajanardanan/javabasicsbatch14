package com.syntax.class11;

public class Employee {
int eno;
String name;
String dept;
void work()
{
	System.out.println(name+" is working at "+ dept);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		emp1.eno=101;
		emp1.name="Athira";
		emp1.dept="IT";
		Employee emp2=new Employee();
		emp2.eno=102;
		emp2.name="Saketh";
		emp2.dept="Doctor";
		emp1.work();
		emp2.work();

	}

}
