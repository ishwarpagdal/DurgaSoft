package com.selenium.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.ExcelFileUtil;

public class ParameterizationTest
{

	/*
	 * @Test(dataProvider = "getData") public void parameters(String username,String
	 * password) { System.out.println(username); System.out.println(password);
	 * 
	 * }
	 * 
	 * 
	 * @DataProvider public Object[][] getData() throws Throwable { ExcelFileUtil
	 * excel=new ExcelFileUtil();
	 * 
	 * 
	 * 
	 * for (int i = 0; i < excel.rowCount("TestNG"); i++) { for (int j = 0; j
	 * <excel.colCount("TestNG", i); j++) { Object[][] data=new
	 * Object[excel.rowCount("TestNG")][excel.colCount("TestNG", i)];
	 * data[0][0]=excel.getData("TestNG", i, j);
	 * 
	 * }
	 * 
	 * 
	 * }
	 * 
	 * // return data; // data[1][0]="Vasudeva"; // data[1][1]="vasu2";
	 * //data[1][0]="Selenium";
	 * 
	 * 
	 * }
	 */
}
