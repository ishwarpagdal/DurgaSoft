package com.seleniumvasu.methods;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.ExcelFileUtil;
import Utilities.PropertyFileUtil;

public class Libraray 
{
	ChromeDriver driver;
	String res;
	//appLaunch
	
	public String appLaunch(String url)
	{
		
		driver=new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		if(driver.findElement(By.name("username")).isDisplayed())  
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		
		return res;
		
	}
	
	//appLogin
	
	public String appLogin(String username,String password)
	{
		driver.findElement(By.name("username")).sendKeys(username);  //hard coded
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		//validation
			
		if(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).isDisplayed())
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		
		return res;
		
	}
	
	//appLogout
	
	public String appLogout()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		
		if(driver.findElement(By.name("username")).isDisplayed())  
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		
		return res;
	}
	
	//appClose
	
	public void appClose()
	{
		driver.close();
	}
	
	public static void main(String[] args) throws Throwable {
		
		Libraray app=new Libraray();
		
		ExcelFileUtil execl=new ExcelFileUtil();
		
		System.out.println(execl.rowCount("VasuDeva"));
		
		
		System.out.println(execl.colCount("VasuDeva",0));
		
		
		System.out.println(execl.getData("VasuDeva", 1, 0));
		
		execl.setData("VasuDeva", 1, 2, "FAIL");
		// results=app.appLaunch("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	//System.out.println(results);
		
		//AdminLogin--TC1
	//	app.appLaunch(PropertyFileUtil.getValueForKey("URL"));
		
	//	app.appLogin(execl.getData("VasuDeva", 1, 0), ws.getRow(1).getCell(1).getStringCellValue());
		
	//	app.appLogout();
		
	//	app.appClose();
		
		
		//employeeCreation--TC2
		/*
		 * app.appLaunch(
		 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 * app.appLogin("Admin", "admin123"); //empCreation(); app.appLogout();
		 * app.appClose();
		 */
		
		
		
		
	
	}
	
}
