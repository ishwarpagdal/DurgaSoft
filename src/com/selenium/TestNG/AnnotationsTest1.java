package com.selenium.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsTest1
{

	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod executed");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test1 Executed");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2 Executed");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass executed");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod executed");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeforeClass executed");
	}
	
}
