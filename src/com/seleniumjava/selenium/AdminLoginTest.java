package com.seleniumjava.selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.PropertyFileUtil;

public class AdminLoginTest 
{

	public static void main(String[] args) throws Throwable 
	{
	
		
		//Application Launch
		ChromeDriver driver=new ChromeDriver();
		
		driver.get(PropertyFileUtil.getValueForKey("URL"));
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		
		//validate
		
		/*
		 * String actTitle=driver.getTitle();
		 * 
		 * if(expTitle.equals(actTitle)) { System.out.println("AppLaunch pass"); }else {
		 * System.out.println("Applaunch Fail"); }
		 */
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		if(driver.findElement(By.name("username")).isDisplayed())  //true / flase
		{
			System.out.println("appLaunch pass");
		}else
		{
			System.out.println("AppLaunch fail");
		}
		
		//wait
		
		//Application Login
		
		
		driver.findElement(By.name("username")).sendKeys(PropertyFileUtil.getValueForKey("username"));  //hard coded
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		
		driver.findElement(By.name("password")).sendKeys(PropertyFileUtil.getValueForKey("password"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		//validation
		
		
		String actDashboard=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		
		if(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).isDisplayed())
		{
			System.out.println("AppLogin Pass");
		}else
		{
			System.out.println("AppLogin Fail");
		}
		
		//Application Logout
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		//wait
		//validate 
		
		//Application Close
		
		driver.close();
		

	}

}
