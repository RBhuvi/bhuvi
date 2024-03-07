package sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Browser\\src\\test\\resources\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://theautomationzone.blogspot.com/2020/07/basic-dropdown.html");
		WebElement multi=driver.findElement(By.id("cars"));
		Select mul=new Select(multi);
		mul.selectByIndex(0);
		mul.selectByValue("audi");
		mul.selectByVisibleText("Opel");
		mul.deselectByIndex(0);
		List<WebElement>list= mul.getOptions();
		for(int i=0;i<list.size();i++) {
			WebElement option=list.get(i);
			System.out.println("Available options "+option.getText());
		}
		List<WebElement>list1=mul.getAllSelectedOptions();
		for(WebElement w:list1) {
			System.out.println("Selected option "+w.getText());
		}
	}
}

