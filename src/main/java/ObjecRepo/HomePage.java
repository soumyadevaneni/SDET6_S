

package ObjecRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLiibraries.WebDriverUtil;

public class HomePage {
WebDriver driver;
public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[text()='Contacts']")
private WebElement contactlink;

@FindBy(xpath="//img[@src=\"themes/softed/images/user.PNG\"]")
private WebElement logoutimg;

@FindBy(xpath="//a[text()='Sign Out']")
private WebElement logoutbtn;
public WebElement getContactlink() {
	return contactlink;
}

public WebElement getLogoutimg() {
	return logoutimg;
}

public WebElement getLogoutbtn() {
	return logoutbtn;
}

public void logoutfromApp() throws Throwable {
	WebDriverUtil webdriverutil=new WebDriverUtil(driver);
	webdriverutil.movetoElement(logoutimg);
	Thread.sleep(2000);
	logoutbtn.click();
	// TODO Auto-generated method stub
	
}

}