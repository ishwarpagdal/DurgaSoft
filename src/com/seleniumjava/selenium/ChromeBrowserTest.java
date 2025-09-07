package com.seleniumjava.selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.seleniumjava.java.Vasu;

public class ChromeBrowserTest
{

	public static void main(String[] args) 
	{
		
		//ArrayList<String> l=new ArrayList();
		
		// TODO Auto-generated method stub

		/*
		 * Vasu v=new Vasu();
		 * 
		 * v.add();
		 */
		
		ChromeDriver driver=new ChromeDriver();
		
		//driver.get("Http://Flipkart.com");
		
		driver.navigate().to("http://Google.co.in");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.className("gb_v")).click();
		
		driver.findElement(By.linkText("Gmail")).click();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		
	}

}
