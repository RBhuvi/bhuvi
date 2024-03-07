package sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Browser\\src\\test\\resources\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		/*WebElement simple=driver.findElement(By.xpath("(//button[contains(text(),'click the button to')])[1]"));
		simple.click();
		Thread.sleep(2000);
		Alert al1=driver.switchTo().alert();
		al1.accept();*/
		/*Actions a=new Actions(driver);
		WebElement dismiss=driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		a.click(dismiss).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[contains(text(),'click the button to')])[2]")).click();
		Alert al2=driver.switchTo().alert();
		Thread.sleep(2000);
	    al2.dismiss();*/
		Actions a=new Actions(driver);
		WebElement dismiss=driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		a.click(dismiss).perform();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("(//button[contains(text(),'click the button to')])[3]")).click();
		Alert al=driver.switchTo().alert();
		al.sendKeys("user is valid");
		Thread.sleep(2000);
		String alrtmsg=driver.switchTo().alert().getText();
		System.out.println(alrtmsg);
		driver.quit();
	}

}
