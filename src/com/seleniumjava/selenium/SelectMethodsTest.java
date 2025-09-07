package com.seleniumjava.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodsTest
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://Amazon.in");
		
		driver.manage().window().maximize();
		
		//WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
	//	Select sl=new Select(drop);
		
		Select sl=new Select(driver.findElement(By.id("searchDropdownBox")));
		
		List<WebElement> dropList=sl.getOptions();
		
		System.out.println(dropList.size());
		
		sl.selectByIndex(7);
		
		//sl.selectByVisibleText("Books");
		
		//sl.selectByValue("search-alias=baby");
		
		
	//	System.out.println(sl.getFirstSelectedOption().getText());
		
	//	System.out.println(sl.isMultiple());  //true/false
		
	/*
	 * List<WebElement> selectedList=sl.getAllSelectedOptions();
	 * 
	 * for (int i = 0; i < selectedList.size(); i++) {
	 * System.out.println(selectedList.get(i).getText()); }
	 */
		
		
	}

}
