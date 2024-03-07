package project1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBys;

public class PageObject1 extends BaseClasss {
	@FindBys({@FindBy(id="email"),@FindBy(xpath="//input[@name='email']")})
	private WebElement userName;
	@FindBys({@FindBy(id="pass"),@FindBy(xpath="//input[@type='password']")})
	private WebElement pwd;
	@FindBys({@FindBy(name="login"),@FindBy(xpath="//button[@type='submit']")})
	private WebElement logIn;
	public WebElement getUserName()
	{
		return userName;
	}
	public WebElement getPwd()
	{
		return pwd;
	}
	public WebElement getLogIn()
	{
		return logIn;
	}
	public PageObject1()
	{
		PageFactory.initElements(driver,this);
	}

}
