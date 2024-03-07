package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Browser\\src\\test\\resources\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
       /* driver.get("https://www.facebook.com/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement emai=driver.findElement(By.id("email"));
        js.executeScript("arguments[0].setAttribute('value','abc@gmail.com')",emai);
        WebElement btn=driver.findElement(By.name("login"));
        js.executeScript("arguments[0].click()",btn);*/
        driver.get("https://www.myntra.com/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,2000)");
        Thread.sleep(2000);
        js.executeScript("window.scroll(0,-2000)");
	}

}
