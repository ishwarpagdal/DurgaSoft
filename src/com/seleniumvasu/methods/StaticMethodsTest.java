package com.seleniumvasu.methods;

public class StaticMethodsTest 
{

	//1. method with return type with parameters
	
	public static int add(int a,int b)
	{
		int sum=a+b;
		
		return sum;
	}
	
	public static void main(String[] args) 
	{
		
		//syntax:
		// classname.methodname();
		
		int results=StaticMethodsTest.add(20, 10);
		
		System.out.println(results);
		
	}
}
