package sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shot {

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Browser\\src\\test\\resources\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	TakesScreenshot ts=(TakesScreenshot)driver;
	//WebElement logo=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
	//File temp=logo.getScreenshotAs(OutputType.FILE);
	File temp=ts.getScreenshotAs(OutputType.FILE);
    File perm=new File("./images/Screenshot2.png");
    //File perm=new File("./images/Screenshot1.png");
	FileUtils.copyFile(temp, perm);
	driver.quit();
	
	}

}
