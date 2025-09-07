package com.seleniumjava.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentTest1 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.quikr.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	//	driver.findElement(By.xpath("//span[text()='NOT NOW']")).click();
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//span[text()='NOT NOW']"))).click().build().perform();
		
		driver.findElement(By.xpath("//a[@id='searchedCat']")).click();
		
		List<WebElement> dropList=driver.findElements(By.xpath("//div[@id='category-dropdown']/ul/li/a"));
		
		System.out.println(dropList.size());
		
		
		
		
	}

}
