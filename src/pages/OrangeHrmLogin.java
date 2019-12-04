package pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrmLogin 
{
	@FindBy(id="drlist")
	public WebElement selectbranch;
	
	@FindBy(id="txtuId")
	public WebElement uname;
	
	@FindBy(id="txtPword")
	public WebElement upwd;
	
	@FindBy(id="login")
	public WebElement login;
	
	@FindBy(xpath="//*[@src='images/admin_but_03.jpg']")
	public WebElement logout;
	
	public OrangeHrmLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String selectbranch(String x)
	{
		Select branchlist=new Select(selectbranch);
		branchlist.selectByVisibleText(x);
//		System.out.println(x);
		return x;
	}
	public void uname(String x)
	{
		uname.sendKeys(x);
	}
	public void upwd(String x)
	{
		upwd.sendKeys(x);
	}
	public void login()
	{
		login.click();
	}
	public void logout()
	{
		logout.click();
	}
}
