package test;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import pages.OrangeHrmLogin;

public class OrangeHrmLaunch {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ratnam1\\chromedriver_win32\\78 version\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		OrangeHrmLogin ohrmlogin=new OrangeHrmLogin(driver);
		File f=new File("D:\\different user login.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s=wb.getSheet(1);
		int row =s.getRows();
		int colm=s.getColumns();
		System.out.println(row);
		System.out.println(colm);
		String inputdata[][]=new String[row][colm];
		Thread.sleep(2000);
		
		
		for (int i = 1; i<row; i++) 
		{	
			
			for (int j = 1; j<colm; j++) 
			{	
				Thread.sleep(500);
				Cell c=s.getCell(j, i);
				String x= (inputdata[j][i]=c.getContents());
				
			
				System.out.println(inputdata[j][i]);
				Thread.sleep(500);
				ohrmlogin.selectbranch(x);
				Thread.sleep(500);
				ohrmlogin.uname(x);
				Thread.sleep(500);
				ohrmlogin.upwd(x);
				Thread.sleep(500);
				ohrmlogin.login();
				Thread.sleep(5000);
				ohrmlogin.logout();
			}
		}
		return;
	}
}
