package com.seleniumjava.java;

public class StringComparisionTest 
{

	public static void main(String[] args) 
	{
		String str1="Selenium Training";
		
		String str2="Vasu";
		
		/*
		 * if(str1.equals(str2)) { System.out.println("Both are equal"); }else {
		 * System.out.println("Both are not equal"); }
		 */
		
		if(str1.contains(str2))
		{
			System.out.println("exist");
		}else
		{
			System.out.println("not exist");
		}

	}

}
