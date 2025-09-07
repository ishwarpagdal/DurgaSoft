package com.selenium.TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest2
{
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite Executed");
	}

	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after Suite Executed");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test Executed");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test3 Executed");
	}
	@Test
	public void test4()
	{
		System.out.println("Test4 Executed");
	}

	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test Executed");
	}
	
}
