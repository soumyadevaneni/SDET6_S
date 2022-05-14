package Comw2aPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Com.Vtiger.ObjectRepo.ConatctInfoPage;
import Com.Vtiger.ObjectRepo.CreateNewContactPage;
import Com.Vtiger.generic.TestData;
import GenericLiibraries.BaseClass;
import GenericLiibraries.Testdata;
import GenericLiibraries.WebDriverUtil;
import ObjecRepo.ContactInfopage;
import ObjecRepo.CreateContact;
import ObjecRepo.HomePage;

public class Comtc_25vtiger extends BaseClass {

	@Test
	public void Createcontact_org() throws InterruptedException {
	              
				WebDriverUtil webdriverutil = new WebDriverUtil(driver);
		        HomePage homepage = new HomePage(driver);
		        homepage.getContactlink().click();
		        ContactInfopage conatctInfoPage = new  ContactInfopage(driver);
				conatctInfoPage.getCreatecontactsimg().click();
				Testdata testData= new Testdata();

				String contactname=testData.getlastname();

				System.out.println(contactname);

				CreateContact createNewContactPage = new CreateContact(driver);
				createNewContactPage.getLastnameEdt().sendKeys(contactname);

				//createNewContactPage.getOrganizationLookUpImage().click();

				Thread.sleep(2000);
				webdriverutil.switchwindow("Accounts");

				Thread.sleep(4000);
				webdriverutil.switchwindow("Contacts");

				createNewContactPage.getSaveBtn().click();
				Thread.sleep(2000);
				


				String contactid=createNewContactPage.getcontactid().getText();

				System.out.println(contactid);
				driver.navigate().refresh();

				homepage.getContactlink().click();

				conatctInfoPage.checkcontactcreated(contactid);

				Thread.sleep(4000);

				String actualcontactlastname=conatctInfoPage.getactualcontact().getText();

				System.out.println(actualcontactlastname);

				if (actualcontactlastname.equals(contactname)) 
				{
					System.out.println("Tc Passes");
				}
				else {
					System.out.println("TC Fail");
				}
			
				
	}
}
