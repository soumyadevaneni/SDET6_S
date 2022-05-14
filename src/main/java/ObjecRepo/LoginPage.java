package ObjecRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLiibraries.FileUtil;

public class LoginPage {

WebDriver driver;

public LoginPage(WebDriver driver) {
	
	this.driver=driver;
	
  PageFactory.initElements(driver, this);
}
@FindBy(name="user_name")

private WebElement usernametxtfld;

@FindBy(name="user_password")

private WebElement passwordtxtfld;

@FindBy(id="submitButton")

private WebElement loginbtn;

public WebElement getUsernametxtfld() {
	return usernametxtfld;
}

public WebElement getPasswordtxtfld() {
	return passwordtxtfld;
}

public WebElement getLoginbtn() {
	return loginbtn;
}
public void logintoApp() throws Throwable {
	  FileUtil fileutil = new FileUtil();
  usernametxtfld.sendKeys(fileutil.readDatafromPropertyfile("username"));
  passwordtxtfld.sendKeys(fileutil.readDatafromPropertyfile("password"));
  loginbtn.click();
}
}