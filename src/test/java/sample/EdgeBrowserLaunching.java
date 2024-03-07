package sample;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeBrowserLaunching {
	public static void main(String[] args)throws InterruptedException 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		String Webpagetitle=driver.getTitle();
		System.out.println(Webpagetitle);
		String Webpageurl=driver.getCurrentUrl();
		System.out.println(Webpageurl);
		//String Pagesource=driver.getPageSource();
		//System.out.println(Pagesource);
		driver.navigate().to("https://www.ajio.com/shop/women");
		Thread.sleep(2500);
		driver.navigate().back();
		Thread.sleep(2500);
		driver.navigate().refresh();
		Thread.sleep(2500);
		String win=driver.getWindowHandle();
		System.out.println(win);
		Set<String>allwin=driver.getWindowHandles();
	int count=allwin.size();
	System.out.println(count);
	Thread.sleep(2500);
	driver.quit();		
}
	
}
