package com.seleniumjava.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDownTest
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.shadi.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Join Now")).click();
		
		//month
		
		Select month=new Select(driver.findElement(By.id("dob_m")));
		
		month.selectByIndex(6);
		 
		//day
		
		Select day=new Select(driver.findElement(By.id("dob_d")));
		
		day.selectByIndex(8);
		
		//year
		
		Select year=new Select(driver.findElement(By.id("dob_y")));
		
		year.selectByIndex(7);

	}

}
