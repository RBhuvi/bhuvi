package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebbTableed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Browser\\src\\test\\resources\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/cricket-series/6732/icc-circket-world-cup-2023/points-table");
		WebElement table=driver.findElement(By.xpath("(//table)[1]"));
		WebElement heading=table.findElement(By.tagName("thead"));
		WebElement headingrow=heading.findElement(By.tagName("tr"));
		List<WebElement> headingdata=headingrow.findElements(By.tagName("th"));
		for(WebElement w:headingdata) {
			String text=w.getText();
			System.out.println("The head data is "+text);
		}
		WebElement content=table.findElement(By.tagName("tbody"));
		List<WebElement> row=content.findElements(By.tagName("tr"));
		for(int i=0;i<row.size();i++) {
			WebElement data=row.get(i);
			List<WebElement> col= data.findElements(By.tagName("td"));
			for(WebElement w:col) {
				System.out.print("The column is "+w.getText());
				
			}
			
		}
		
		
	}

}
