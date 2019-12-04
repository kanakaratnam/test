package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DifferentUsersLogin 
{
	@FindBy(id="drlist")
	public WebElement selectbranch;
	
	@FindBy(id="txtuId")
	public WebElement uname;
}
