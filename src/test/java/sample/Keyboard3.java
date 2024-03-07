package sample;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard3 {
		public static void main(String[] args) throws AWTException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Browser\\src\\test\\resources\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.greenstechnologys.com/");
			driver.manage().window().maximize();
			WebElement course=driver.findElement(By.xpath("//a[text()='COURSES']"));
			Actions a=new Actions(driver);
			a.moveToElement(course).perform();
			WebElement sel=driver.findElement(By.xpath("(//span[text()='Selenium'])[1]"));
			a.doubleClick(sel).perform();
			
	}

}
