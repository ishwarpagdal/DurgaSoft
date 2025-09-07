package com.seleniumjava.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	//	WebElement signIn=driver.findElement(By.id("nav-link-accountList"));
		
		Actions mouse=new Actions(driver);
		
	//	mouse.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
	//	mouse.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[3]/span"))).click().build().perform();
		
		mouse.moveToElement(driver.findElement(By.id("nav-link-accountList"))).moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[3]/span"))).click().build().perform();
		//driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[3]/span")).click();

	}

}
