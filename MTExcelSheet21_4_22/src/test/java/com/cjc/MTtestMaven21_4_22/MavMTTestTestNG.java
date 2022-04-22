package com.cjc.MTtestMaven21_4_22;

import org.testng.annotations.Test;

//import Pro_maven001.MTTestSmoke01;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class MavMTTestTestNG {

	WebDriver driver;

	Properties pro=new Properties();
	static Logger log=Logger.getLogger(MavMTTestTestNG.class.getName());
	@BeforeSuite
	public void beforeSuite() throws InterruptedException, IOException {
		 System.out.println("Mercury Tours Guru99 in chrome Browser");
		  
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibhav\\Desktop\\Automation\\Automation\\ChromeDriverZIPfiles\\Chrome100\\chromedriver.exe");
		  driver=new ChromeDriver();
		  Thread.sleep(1110);
		  FileInputStream f1=new FileInputStream("C:\\Users\\vaibhav\\Desktop\\Automation\\Common.properties");
		  pro.load(f1);

		  log.info("INFO");
		  System.out.println("Mercury Tours Guru99 in chrome Browser");
		  
	}

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		 
		 // driver.get(durl);
		// driver.get("https://demo.guru99.com/test/newtours/register.php");
		//System.out.println("URL"+pro.getProperty("URL"));
		driver.get(pro.getProperty("URL1"));
		 log.info("INF1O");

		Thread.sleep(1110);
		  System.out.println("Before Test Annotation start");
	}

	@BeforeClass
	public void beforeClass() throws InterruptedException {

		  driver.manage().window().maximize();
		  Thread.sleep(1110);
		 // driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		  System.out.println("Before class Annotation");
	}

	@BeforeMethod
	public void beforeMethod() {
		  
//		  Set<Cookie> cookies=driver.manage().getCookies();
//		  for(Cookie co:cookies)
//		  {
//			  System.out.println(co.getName());
//		  }
//		  log.info("INFO");
		  System.out.println("Before Method get Cookies");
	}

	@Test
	public void fMtt01() throws IOException, InterruptedException
	{
		
		log.info("login");
		
			//ForFile
			FileInputStream f1=new FileInputStream("C:\\Users\\vaibhav\\Desktop\\Automation\\EXCELFiles\\StudInfo1.xlsx");
			//WorkBook
			XSSFWorkbook wb=new XSSFWorkbook(f1);
			//forSheet
			XSSFSheet sheet=wb.getSheet("Sheet1");
			//forRow
			XSSFRow row=sheet.getRow(1);
			//forCell
			XSSFCell cell=row.getCell(0);
//			//toprint
//			String val=cell.getStringCellValue();
//			System.out.println(val);
				 
			String uname=cell.getStringCellValue();
			
			XSSFRow row1=sheet.getRow(1);
			//forCell
			XSSFCell cell1=row1.getCell(0);
			String pass=cell1.getStringCellValue();
	 
			driver.findElement(By.name("userName")).sendKeys(uname);
			driver.findElement(By.name("password")).sendKeys(pass);
			Thread.sleep(1111);
			driver.findElement(By.name("submit")).click();
			
			Thread.sleep(1111);
			
			sheet.getRow(1).createCell(2).setCellValue("Pass");
			sheet.getRow(2).createCell(2).setCellValue("Fail");			
			
			FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\vaibhav\\\\Desktop\\\\Automation\\\\EXCELFiles\\\\StudInfo1.xlsx");
			wb.write(fos);
			
			
	}
	
//	@AfterMethod
//	public void afterMethod() throws IOException {
//		 File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			
//		  FileUtils.copyFileToDirectory(src, new File("C:\\Users\\vaibhav\\Desktop\\Automation\\Automation\\SCREEN SHOT\\") );
//
//		  System.out.println("Screen Shot Success");
//	}
//	
//	@AfterClass
//	public void afterClass() {
//		System.out.println("Delete Cookies");
//	}
//
//	@AfterTest
//	public void afterTest() {
//		System.out.println("DataBase Close");
//	}
//
//	@AfterSuite
//	public void afterSuite() {
//		System.out.println("Close window...");
//		driver.close();
//	}

	
	

}
