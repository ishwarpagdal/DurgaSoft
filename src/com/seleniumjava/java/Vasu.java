package com.seleniumjava.java;

public class Vasu
{

	//variable
	
	int k=2;
	
	
	//method
	
	public void add()
	{
		int a=20;
		
		int b=30;
		
		int sum=a+b;
		
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) 
	{
		// Object
		
		Vasu v=new Vasu();
		
		System.out.println(v.k);
		
		v.add();

	}

}
