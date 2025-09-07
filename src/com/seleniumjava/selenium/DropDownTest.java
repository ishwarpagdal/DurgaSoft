package com.seleniumjava.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownTest {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://Amazon.in");
		
		driver.manage().window().maximize();
		
		
		
		List<WebElement> dropList=driver.findElements(By.xpath("//select[@id='searchDropdownBox']/option"));
		
		System.out.println(dropList.size());
		
	for (int i = 0; i < dropList.size(); i++) 
	{
		//System.out.println(dropList.get(i).getText());
		
		//dropList.get(i).click();
		
		/*
		 * if(dropList.get(i).getText().equals("Books")) { dropList.get(i).click(); }
		 */
		
		//

		
		dropList.get(i).click();
		
		if(dropList.get(i).isSelected())
		{
			System.out.println(dropList.get(i).getText()+"  : is selected");
		}else
		{
			System.out.println(dropList.get(i).getText()+"  : is not selected");
		}
	}	

	}

}
