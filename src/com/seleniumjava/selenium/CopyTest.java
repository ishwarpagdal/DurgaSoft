package com.seleniumjava.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyTest {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/advanced_search");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("xX4UFf")).sendKeys("Kranthikumar");
		
		//select text(Ctrl+a)
		
		driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"a");
		
		//copy text(Ctrl+c)
		
		driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"c");
		
		//paste text(Ctrl+v)
		
		driver.findElement(By.id("mSoczb")).sendKeys(Keys.CONTROL+"v");
		
		Actions pageDown=new Actions(driver);
		
		pageDown.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		
		driver.findElement(By.xpath("//*[@id=\"s1zaZb\"]/div[5]/div[9]/div[2]/input[2]")).click();

	}

}
