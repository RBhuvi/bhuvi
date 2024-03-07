package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Browser\\src\\test\\resources\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("https://www.flipkart.com/");
		WebElement elec=driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions a=new Actions(driver);
		a.moveToElement(elec).perform();
		WebElement gam=driver.findElement(By.xpath("//a[text()='Gaming']"));
		wait.until(ExpectedConditions.visibilityOf(gam));
		gam.click();
		wait.until(ExpectedConditions.titleContains("Gaming"));
		System.out.println("The title is"+driver.getTitle());
		driver.quit();
	}
}