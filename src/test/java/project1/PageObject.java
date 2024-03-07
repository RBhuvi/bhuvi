package project1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject extends BaseClasss
{
		@FindBy(id="email")
		private WebElement userName;
		public WebElement getUserName()
		{
			return userName;
		}
		public PageObject()
		{
			PageFactory.initElements(driver,this);		
	    
}
}