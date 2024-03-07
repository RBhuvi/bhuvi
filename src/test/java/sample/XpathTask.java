package sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class XpathTask {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Browser\\src\\test\\resources\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("ravi@gmail.com");
		Thread.sleep(2000);
		String attri=email.getAttribute("type");
		System.out.println(attri);
		WebElement phno=driver.findElement(By.xpath("//input[@type='tel']"));
		phno.sendKeys("9876543210");
		Thread.sleep(2000);
		WebElement male=driver.findElement(By.xpath("//input[@value='Male']"));
		male.click();
		Thread.sleep(2000);
		String mtag=male.getTagName();
		System.out.println(mtag);
		WebElement check=driver.findElement(By.id("checkbox2"));
		check.click();
		Thread.sleep(2000);
		WebElement refresh=driver.findElement(By.id("Button1"));
		String subtxt=refresh.getText();
		System.out.println(subtxt);
		//WebElement refresh=driver.findElement(By.xpath("//button[@type='button']"));
		//refresh.click();
		Thread.sleep(2000);
		driver.quit();
}
}
