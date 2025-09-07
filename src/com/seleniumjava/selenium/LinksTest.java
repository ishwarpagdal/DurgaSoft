package com.seleniumjava.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTest {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://Google.co.in");
		
		driver.manage().window().maximize();
		
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		/*
		 * for (int i = 0; i < links.size(); i++) {
		 * System.out.println(links.get(i).getText()); }
		 */
		
		/*
		 * for (WebElement element : links) { System.out.println(element.getText()); }
		 */
		
		for (int i = 0; i < links.size(); i++)
		{
			
			/*
			 * if(!links.get(i).getText().isEmpty()) {
			 * System.out.println(links.get(i).getText()); }
			 */
			
			if(links.get(i).getText().equals("Images"))
			{
				links.get(i).click();
			}
			
		}

	}

}
