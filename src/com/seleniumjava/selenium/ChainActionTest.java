package com.seleniumjava.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChainActionTest {

	public static void main(String[] args) 
	{
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://ceotelangana.nic.in/");
		
		driver.manage().window().maximize();
		
		WebElement ca=driver.findElement(By.xpath("//*[@id=\"menu-primary-menu\"]/li[5]/a"));
		WebElement la=driver.findElement(By.xpath("//*[@id=\"menu-primary-menu\"]/li[5]/ul/li[2]/a"));
		WebElement ge=driver.findElement(By.xpath("//*[@id=\"menu-primary-menu\"]/li[5]/ul/li[2]/ul/li[1]/a"));
		WebElement la4=driver.findElement(By.xpath("//*[@id=\"menu-primary-menu\"]/li[5]/ul/li[2]/ul/li[1]/ul/li[5]/a"));
		
		
		Actions chain=new Actions(driver);
		
		chain.moveToElement(ca).moveToElement(la).moveToElement(ge).pause(2000).moveToElement(la4).click().build().perform();

	}

}
