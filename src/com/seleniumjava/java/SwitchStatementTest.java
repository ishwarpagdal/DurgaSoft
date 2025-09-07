package com.seleniumjava.java;

public class SwitchStatementTest
{

	public static void main(String[] args)
	{
		//switch: -- it is used to execute the statements based on a value/argument
		
		//syntax:
		
		/*
		 * switch(argument) { case 1: statem; break; case 2: statem; break; . .
		 * 
		 * default: statem; break; }
		 */

		//write a program to print weekdaynames for a given number
		
	//	int n=9;
		
		/*
		 * switch (n)//4 { case 1: System.out.println("Sunday"); break; case 2:
		 * System.out.println("Monday"); break; case 3: System.out.println("Tuesday");
		 * break; case 4: System.out.println("Wednesday"); break; //terminates case 5:
		 * System.out.println("Thursday"); break; case 6: System.out.println("Friday");
		 * break; case 7: System.out.println("Saturday"); break; default:
		 * System.out.println("Out of range"); break; }
		 */
		
		/*
		 * String name="January";
		 * 
		 * switch(name) {
		 * 
		 * case "January": case "Jan": System.out.println("1"); break; case "Feb":
		 * System.out.println("2"); break;
		 * 
		 * }
		 */
		
		int n=1;
		
		if(n==1)
		{
			System.out.println("Sunday");
		}  //not terminated
		if(n==2)
		{
			System.out.println("Monday");
		}
		if(n==3)
		{
			System.out.println("Tuesday");
		}
		}

}
