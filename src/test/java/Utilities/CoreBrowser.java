package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class CoreBrowser {
String str;
WebDriver driver;

@BeforeTest
public WebDriver SelectBrowser(String Browsername, String URL)
	{
		if (Browsername.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C://new//selenium-chrome-driver//chromedriver.exe");
		driver = new ChromeDriver();
		}
//else
		{
			System.setProperty("webdriver.firefox.driver", "C://new//selenium-firefox-driver//3.0.0-beta4//selenium-firefox-driver");
			driver = new FirefoxDriver();
		}
		return driver;
}
   
}