package sample;
//actions
import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Drags {
	public static void main(String[] args) throws AWTException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement bank=driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		WebElement src=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions a=new Actions(driver);
		a.dragAndDrop(bank, src).perform();
		WebElement bank1=driver.findElement(By.xpath("(//a[contains(text(),'5000')])[4]"));
		WebElement src1=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(bank1, src1).perform();
		
}
}