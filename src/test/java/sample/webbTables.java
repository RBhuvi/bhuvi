package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webbTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Browser\\src\\test\\resources\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://letcode.in/table");
	    WebElement table=driver.findElement(By.id("shopping"));
		WebElement heading=table.findElement(By.tagName("thead"));
		WebElement headingrow=heading.findElement(By.tagName("tr"));
		List<WebElement> list=headingrow.findElements(By.tagName("th"));
		for(WebElement w:list) {
			String text=w.getText();
			System.out.println("The head column name is "+text);
		}
		WebElement content=driver.findElement(By.xpath("(//tbody)[1]"));
		List<WebElement> option=content.findElements(By.tagName("tr"));
		System.out.println("The rows in content "+option.size());
		for(WebElement w1:option) {
			List<WebElement> lists= w1.findElements(By.tagName("td"));
			WebElement firstcol=lists.get(0);
			System.out.println("The first column value is "+firstcol.getText());
			WebElement secondcol=lists.get(1);
			System.out.println("The second column value is "+secondcol.getText());
		}
		WebElement last=driver.findElement(By.tagName("tfoot"));
		List<WebElement> options=last.findElements(By.tagName("td"));
			for(WebElement w2:options) {
				System.out.print("The last footrow is "+w2.getText());
			}	
	}

}
