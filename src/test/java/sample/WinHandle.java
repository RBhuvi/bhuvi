package sample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Browser\\src\\test\\resources\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String parenthandle=driver.getWindowHandle();
        System.out.println("parent window="+parenthandle);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,1000)");
        driver.findElement(By.id("newWindowBtn")).click();
        Set<String>handles=driver.getWindowHandles();
        for(String handle:handles) {
        	System.out.println(handle);
        	if(!handle.equals(parenthandle)) {
        	driver.switchTo().window(handle);
        	driver.close();
        	}
        }
        driver.switchTo().window(parenthandle);
        driver.quit();
	}

}
