package com.seleniumjava.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderLinksTest1 {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://Amazon.in");
		
		driver.manage().window().maximize();
		
		WebElement header=driver.findElement(By.id("nav-xshop"));
		
		List<WebElement> headerLinks=header.findElements(By.tagName("a"));
		
		System.out.println(headerLinks.size());
		
		for (int i = 0; i < headerLinks.size(); i++)
		{
			System.out.println(headerLinks.get(i).getText());
		}
 
	}

}
