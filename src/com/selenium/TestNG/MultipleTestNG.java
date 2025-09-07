package com.selenium.TestNG;

import org.testng.annotations.Test;

public class MultipleTestNG 
{

	@Test(groups = "Sometesting")
	public void add()
	{
		System.out.println("add Test");
	}
	
	@Test(groups = "Regressiontesting")   
	public void mul()
	{
		System.out.println("mul Test");
	}
	
	@Test(groups = "Regressiontesting")     
	public void sub()
	{
		System.out.println("sub Test");
	}
	
	@Test(groups = "Sometesting")    
	public void div()
	{
		System.out.println("div Test");
	}
}
