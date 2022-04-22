package com.cjc.MTtestMaven21_4_22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel02 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\vaibhav\\Desktop\\Automation\\EXCELFiles\\Emp.xlsx");
		//WorkBook
		XSSFWorkbook wb=new XSSFWorkbook(f1);
		//forSheet
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
//		sheet.getRow(0).createCell(0).setCellValue("vaibh");
//		sheet.getRow(0).createCell(1).setCellValue("vc.vabs");			
		sheet.createRow(1).createCell(0).setCellValue("Hiiii");
		sheet.createRow(1).createCell(1).setCellValue("vabs");
		sheet.createRow(2).createCell(0).setCellValue("Hiiii");
		sheet.createRow(2).createCell(1).setCellValue("nilesh");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\vaibhav\\Desktop\\Automation\\EXCELFiles\\Emp.xlsx");
		wb.write(fos);
		
	}

}
