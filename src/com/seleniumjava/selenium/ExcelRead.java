package com.seleniumjava.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead
{

	public static void main(String[] args) throws Throwable
	{
		
		FileInputStream fis=new FileInputStream("D:\\SeleniumBatch8\\SeleniumVASU\\TestInputs\\InputSheet.xlsx");

		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("VasuDeva");
		
		System.out.println(ws.getRow(0).getCell(0).getStringCellValue());
		
		System.out.println(ws.getRow(0).getCell(1).getStringCellValue());
		
		System.out.println(ws.getRow(1).getCell(0).getStringCellValue());
		
		System.out.println(ws.getRow(1).getCell(1).getStringCellValue());
		
		int rs=ws.getLastRowNum();
		
	for (int i = 0; i <=rs; i++) 
	{
		System.out.println(ws.getRow(i).getCell(0).getStringCellValue());
		
		
	}

	}

}
