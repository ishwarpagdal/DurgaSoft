package com.seleniumvasu.methods;

public class NSMethods
{

	//1. method with return type with parameters
	
	/*
	 * public int add(int a,int b) { int sum=a+b;
	 * 
	 * return sum; }
	 */
	
	
	//2. method with return type with-out parameters
	
	/*
	 * public int add() { int a=10; int b=20; int sum=a+b;
	 * 
	 * return sum; }
	 */
	//3. method with-out return type with parameters
	
	/*
	 * public void add(int a,int b) { int sum=a+b;
	 * 
	 * System.out.println(sum); }
	 */
	
	//4. method with-out return type with-out parameters
	
	public void add()
	{
		int a=20;
		int b=20;
		
		int sum=a+b;
		
		System.out.println(sum);
	}
	
		
	public static void main(String[] args)
	{
		NSMethods app=new NSMethods();
		
		app.add();//calling a method with method name, it won't return a value
		
	//	int results=app.add();//calling a method with variable, it will return a value
		
	//	System.out.println(results);
		
	}
	
}
