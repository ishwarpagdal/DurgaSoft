package com.seleniumjava.java;

import java.util.Iterator;

public class ForLoopTest {

	public static void main(String[] args)
	{
		// write a program to print "Welcome to selenium" 20 times
		
		//1. ForLoop
		// it is used to execute the statements multiple times ,when we know the exact no of iteration
		
		//syntax:
		
		//for(initialization ; condition; increment/decrement)
	//	{
			//statemts1,2,...;
	//	}
		
	/*
	 * for (int i = 1; i <=20; i++) { System.out.println(i+"    "+"selenium");
	 * 
	 * }
	 */
	 
		for (int i = 1; i <=10; i++)  //table
		{
			for (int j = 1; j <=10; j++) //10 values
			{
				System.out.println(i+"  x  "+j+"  =  "+i*j);
			}
			
		}
		
	/*
	 * for (int i = 1; i <=10; i++) { System.out.println(i); }
	 */
	}

}
