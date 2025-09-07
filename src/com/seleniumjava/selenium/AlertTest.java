package com.seleniumjava.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) 
	{
		//ChromeDriver driver=new ChromeDriver();
		
		//driver.get("http://www.flipkart.com/");
		
		//driver.manage().window().maximize();
		
		//html alerts
		
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button")).click();
		
		//Handle Java script alerts
		
		Alert al=driver.switchTo().alert();
		
		System.out.println(al.getText());
		
		al.accept();
		
	//	al.accept();  //click on ok
		
	//	al.dismiss(); //cancel
		
	//	al.getText(); // capture the text
		
	//	al.sendKeys("vasu");  //enter the text
		
		
		

	}

}
