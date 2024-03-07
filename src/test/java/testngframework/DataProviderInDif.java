package testngframework;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import project1.BaseClasss;

public class DataProviderInDif extends BaseClasss{
@Test (dataProvider="login",dataProviderClass=UseDataProvider.class)
private void tc01(String s1,String s2) {
getDriver("edge");
url("https://www.facebook.com/");
WebElement username=locators("id","email");
textSend(username,s1);
WebElement pwd=locators("id","pass");
textSend(pwd,s2);
}
}
