package com.seleniumjava.selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsTest {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	//	System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.xpath("//*[@id='root']/div[4]/div[2]/nav/ul/li[3]/a/div")).click();
		
		//System.out.println(driver.getWindowHandle());
		
		Set<String> windows=driver.getWindowHandles();
		
		/*
		 * Iterator<String> it=windows.iterator();
		 * 
		 * while(it.hasNext()) { //System.out.println(it.next());
		 * 
		 * driver.switchTo().window(it.next());
		 * 
		 * //System.out.println(driver.getTitle());
		 * 
		 * if(!driver.getTitle().
		 * equals("Resume Writing Services - CV - Bio data | Naukri Fastforward")) {
		 * driver.close(); }
		 * 
		 * }
		 * 
		 * System.out.println(driver.findElement(By.xpath("//*[@id='rw']/span")).getText
		 * ());
		 */
		
		List<String> tab=new ArrayList(windows);
		
		driver.switchTo().window(tab.get(0));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(tab.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
		
	}

}
