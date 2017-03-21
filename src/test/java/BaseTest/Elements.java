package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import Utilities.CoreBrowser;

public class Elements extends CoreBrowser {
	WebDriver driver;
	
	@FindBy (id="txtID")
	WebElement UserId;
	
	@FindBy (id="txtPwd")
	WebElement Pwd;
	
	@FindBy (id="txtCompName")
	WebElement CompanyName;
	
	@FindBy (id="LocalizedButton1")
	WebElement Login;


public Elements(WebDriver driver)
	{
	this.driver= driver;
	}
@Test
public void LogIn(String Username, String Password, String Companyname)
{
	driver.get("https://myhris.adrenalin.in/myadrenalin/login.aspx");
	UserId.sendKeys("p693");
	Pwd.sendKeys("Titcse!@3");
	CompanyName.sendKeys("Silicus");
	Login.click();
}
}

