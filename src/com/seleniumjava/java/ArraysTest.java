package com.seleniumjava.java;

public class ArraysTest
{

	public static void main(String[] args)
	{
		// Arrays: it is a derived data type which can be used to store the multiple values of similar datatypes
		
		//1. Single Dimensional
        //2. Multi Dimensional
		//1. Single Dimensional
		
		 //it is used to the data in the form of a single row/single column
		
		//syntax:
		
		//datatype [] arrayName=new datatype[size];
		
		int [] a=new int[5];
		//Retrieve the data from an array
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		//inserting the values into an array
		
		a[0]=11;
		a[1]=12;
		a[2]=13;
		a[3]=14;
		a[4]=15;
		
		System.out.println("##############");
		//Retrieve the data from an array
		/*
		 * System.out.println(a[0]); System.out.println(a[1]); System.out.println(a[2]);
		 * System.out.println(a[3]); System.out.println(a[4]);
		 */
				
				for (int i = 0; i < a.length; i++)
				{
					System.out.println(a[i]);
				}
		
		
	}

}
