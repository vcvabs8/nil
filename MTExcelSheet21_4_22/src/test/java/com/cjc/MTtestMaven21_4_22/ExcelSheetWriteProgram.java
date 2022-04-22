package com.cjc.MTtestMaven21_4_22;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetWriteProgram {

public static void main(String[] args) throws IOException {
	
	FileInputStream f1=new FileInputStream("C:\\Users\\vaibhav\\Desktop\\Automation\\EXCELFiles\\Employee.xlsx");
	//WorkBook
	XSSFWorkbook wb=new XSSFWorkbook(f1);
	//forSheet
	XSSFSheet sheet=wb.getSheet("Sheet1");
	
	sheet.getRow(4).createCell(0).setCellValue("vaibh");
	sheet.getRow(4).createCell(1).setCellValue("vc.vabs");			
	
	FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\vaibhav\\\\Desktop\\\\Automation\\\\EXCELFiles\\\\Employee.xlsx");
	wb.write(fos);
}
}
