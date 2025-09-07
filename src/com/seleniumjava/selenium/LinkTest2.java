package com.seleniumjava.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest2 
{

	public static void main(String[] args)
	{
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.navigate().to("http:\\amazon.in");
		
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++)
		{
			//System.out.println(links.get(i).getText());
			
			/*
			 * if(!links.get(i).getText().isEmpty()) {
			 * System.out.println(links.get(i).getText()); }
			 */
			
			if(links.get(i).getText().equals("Today's Deals"))
			{
				links.get(i).click();
				
			}
		}
		
		
	}

}
