package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClasss {
	public static WebDriver driver;
	public static void getDriver(String browser) {
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\bhuvi\\Downloads\\Browser\\Browser\\src\\test\\resources\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
		}
		else
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		
	}
	public static void url(String url)
	{
		driver.get(url);
	}
	public static String getTitle()
	{
		return driver.getTitle();
	}
	public static WebElement locators(String locator,String attributevalue)
	{
		if(locator.equalsIgnoreCase("id"))
		{
			WebElement findelement=driver.findElement(By.id(attributevalue));
			return findelement;
		}
		else if(locator.equals("name"))
		{
			WebElement findelement=driver.findElement(By.name(attributevalue));
			return findelement;
			
		}
		
		else if(locator.equals("xpath"))
		{
			WebElement findelement=driver.findElement(By.xpath(attributevalue));
			return findelement;
			
		}
		else {
			WebElement findelement=driver.findElement(By.tagName(attributevalue));
			return findelement;
		}
	}
	public static void textSend(WebElement findElement,String value) {
		findElement.sendKeys(value);
	}
  public static void buttonClick(WebElement findElement) {
	  findElement.click();
  }
  public static void quitBrowser() {
	 driver.quit(); 
  }
}

