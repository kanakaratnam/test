package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DiffUserLoginTest {

	public static void main(String[] args) throws BiffException, IOException 
	{
//		System.setProperty("webdriver.chrome.driver", "D:\\ratnam1\\chromedriver_win32\\78 version\\chromedriver_win32\\chromedriver.exe");
//		ChromeDriver driver =new ChromeDriver();
//		driver.get("http://primusbank.qedgetech.com/");
//		driver.manage().window().maximize();
		
		File f=new File("D:\\different user login.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s=wb.getSheet("sheet2");
		String firstuser=s.getCell(0, 1).getContents();
		String seconduser=s.getCell(0,2).getContents();
		String thirduser=s.getCell(0, 3).getContents();
		
		
		
		
		for (int i = 1; i <=3; i++) 
		{
			
		}
	}

}
