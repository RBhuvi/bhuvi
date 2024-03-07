package stepdefinition;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project1.BaseClasss;

public class StepDefinition1 extends BaseClasss
{
	@Given("User should navigate to the application")
	public void user_should_navigate_to_the_application() {
	    getDriver("chrome");
	    url("https://www.facebook.com/");
	    
	}

	@When("User enter username and password")
	public void user_enter_username_and_password() {
	   WebElement username=locators("id","email");
	   textSend (username,"test@gmail.com");
	   WebElement pass=locators("id","pass");
	   textSend(pass,"654321");
	   
	   
	}

	@Then("User click the login button")
	public void user_click_the_login_button() {
	    WebElement login=locators("name","login");
	    buttonClick(login);
	    
	}


}
