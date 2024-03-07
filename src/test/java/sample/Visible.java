package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Visible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Browser\\src\\test\\resources\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		WebElement day=driver.findElement(By.id("day"));
		boolean issel=day.isDisplayed();
		System.out.println(issel);
		WebElement male=driver.findElement(By.xpath("//input[@value='2']"));
		boolean mal=male.isEnabled();
		System.out.println(mal);
		male.click();
		boolean sel=male.isSelected();
		System.out.println(sel);
	}

}
