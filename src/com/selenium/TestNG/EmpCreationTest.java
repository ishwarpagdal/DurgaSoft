package com.selenium.TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EmpCreationTest extends FunLibrary
{

	
	@Test
	public void empCreation()
	{
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
	}
}
