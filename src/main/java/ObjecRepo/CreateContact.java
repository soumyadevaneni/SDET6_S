package ObjecRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContact {
WebDriver driver;
public CreateContact(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
  @FindBy(name="lastname")
  private WebElement lastnameEdt;
  
 
  @FindBy(name="button")
  private WebElement saveBtn;
public WebElement getLastnameEdt() {
	return lastnameEdt;
}

public WebElement getNotifyowner() {
	return getNotifyowner();
}
public WebElement getSaveBtn() {
	return saveBtn;
	
}
@FindBy(xpath="//td[@id='mouseArea_First Name']/../td[4]")
private WebElement contactid;

public WebElement getcontactid() {
	return contactid;

}
  
}
