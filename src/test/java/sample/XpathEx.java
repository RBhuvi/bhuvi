package sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class XpathEx {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Browser\\src\\test\\resources\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement first=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
				first.sendKeys("Deepthi");
				Thread.sleep(2000);
				String fattri=first.getAttribute("placeholder");
				System.out.println(fattri);
		WebElement last=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));	
		last.sendKeys("Muthu");
		Thread.sleep(2000);
		WebElement fem=driver.findElement(By.xpath("//input[@value='FeMale']"));
		fem.click();
		Thread.sleep(2000);
		String femtag=fem.getTagName();
		System.out.println(femtag);
		WebElement check=driver.findElement(By.id("checkbox1"));
		check.click();
		Thread.sleep(2000);
		WebElement subbutton=driver.findElement(By.xpath("//button[@name='signup']"));
		//subbutton.click();
		String subtagtext=subbutton.getText();
		System.out.println(subtagtext);
		Thread.sleep(2000);
		driver.quit();
	}

}
