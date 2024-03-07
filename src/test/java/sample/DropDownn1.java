package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownn1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Browser\\src\\test\\resources\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		WebElement daysel=driver.findElement(By.id("day"));
		Select s1=new Select(daysel);
		String defaul=s1.getFirstSelectedOption().getText();
		System.out.println(defaul);
		s1.selectByIndex(30);
		Thread.sleep(2000);
		WebElement month=driver.findElement(By.id("month"));
		Select s2=new Select(month);
		if(s2.isMultiple()) {
			System.out.println("Is mulitiple");
			}
		else {
			System.out.println("Is single");
			}
		s2.selectByValue("8");
		WebElement year=driver.findElement(By.id("year"));
		Select s3=new Select(year);
		s3.selectByVisibleText("1990");
		Thread.sleep(2000);
		driver.quit();
	}
}
