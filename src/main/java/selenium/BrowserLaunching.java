package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserLaunching {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Browser\\src\\test\\resources\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
	}

}
