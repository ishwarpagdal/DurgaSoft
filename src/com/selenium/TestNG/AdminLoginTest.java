package com.selenium.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.PropertyFileUtil;

public class AdminLoginTest
{
@Test
public void adminLogin() throws Throwable
{
	ChromeDriver driver=new ChromeDriver();
	
	driver.get(PropertyFileUtil.getValueForKey("URL"));
	
	driver.manage().window().maximize();
	
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	
	
	//validate
	
		Assert.assertTrue(driver.findElement(By.name("username")).isDisplayed());
	//Application Login
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	driver.findElement(By.name("username")).sendKeys(PropertyFileUtil.getValueForKey("username"));  //hard coded
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	
	driver.findElement(By.name("password")).sendKeys(PropertyFileUtil.getValueForKey("password"));
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	//validation
	
	
	
	//Application Logout
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
	
	driver.findElement(By.linkText("Logout")).click();
	//wait
	//validate 
	
	//Application Close
	
	driver.close();
	

}
	
}
