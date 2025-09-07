package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtil
{

	Workbook wb;
	
	public ExcelFileUtil() throws Throwable
	{
		FileInputStream fis=new FileInputStream(PropertyFileUtil.getValueForKey("excelpath"));

		 wb=WorkbookFactory.create(fis);
	}
	
	//rowcount
	
	public int rowCount(String sheetname)
	{
		return wb.getSheet(sheetname).getLastRowNum();
	}
	
	//colCount
	public int colCount(String sheetname,int row)
	{
		return wb.getSheet(sheetname).getRow(row).getLastCellNum();
	}
	//reading data from excel file
	public String getData(String sheetname,int row,int column)
	{
		String data="";
		if(wb.getSheet(sheetname).getRow(row).getCell(column).getCellType()==Cell.CELL_TYPE_NUMERIC)
		{
			int celldata=(int)wb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
			
			data=String.valueOf(celldata);
		}else
		{
			data=wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		}
		
		return data;
	}
	
	//Writing the data into excel file
	
	public void setData(String sheetname,int row,int column,String status) throws Throwable
	{
		
		Sheet sh=wb.getSheet(sheetname);
		
		Row rownum=sh.getRow(row);
		
		Cell cell=rownum.createCell(column);
		
		cell.setCellValue(status);
		
		if(status.equalsIgnoreCase("PASS"))
		{
			CellStyle style=wb.createCellStyle();
			
			Font font=wb.createFont();
			
			font.setColor(IndexedColors.GREEN.getIndex());
			
			style.setFont(font);
			
			rownum.getCell(column).setCellStyle(style);
		}else
			if(status.equalsIgnoreCase("FAIL"))
			{
				CellStyle style=wb.createCellStyle();
				
				Font font=wb.createFont();
				
				font.setColor(IndexedColors.RED.getIndex());
				
				style.setFont(font);
				
				rownum.getCell(column).setCellStyle(style);
			}else
				if(status.equalsIgnoreCase("Not Executed"))
				{
					CellStyle style=wb.createCellStyle();
					
					Font font=wb.createFont();
					
					font.setColor(IndexedColors.BLUE.getIndex());
					
					style.setFont(font);
					
					rownum.getCell(column).setCellStyle(style);	
				}
		
		FileOutputStream fos=new FileOutputStream("D:\\SeleniumBatch8\\SeleniumVASU\\TestOutput\\OutputSheet.xlsx");
		
		wb.write(fos);
		
		fos.close();
		
		
	}
	
}
