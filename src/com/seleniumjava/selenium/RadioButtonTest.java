package com.seleniumjava.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTest {

	public static void main(String[] args) throws Throwable 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		List<WebElement> radioList=driver.findElements(By.xpath("//span[@data-name='gender_wrapper']/span/input"));
		
		System.out.println(radioList.size());
		
		for (WebElement list : radioList) 
		{
			//System.out.println(list.getText()+"-----"+list.getAttribute("checked"));
			list.click();
		}
		
		//driver.findElement(By.xpath("//label[text()='Female']")).click();
	}

}
