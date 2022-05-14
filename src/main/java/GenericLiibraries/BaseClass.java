package GenericLiibraries;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import ObjecRepo.HomePage;
import ObjecRepo.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public WebDriver driver;

public FileUtil fileutil=new FileUtil();

@BeforeClass

public void openBrowser() throws Throwable {

String BROWSER =fileutil.readDatafromPropertyfile("browser");

if(BROWSER.equalsIgnoreCase("chrome"))

{
	WebDriverManager.chromedriver().setup();
	
	driver=new ChromeDriver();
	
}

else if(BROWSER.equalsIgnoreCase("firefox"))
	
{
	WebDriverManager.firefoxdriver().setup();
	
	driver=new FirefoxDriver();
	
}
else {
	System.out.println("No browser provided launching Default browser");
}
driver.get(fileutil.readDatafromPropertyfile("url"));

WebDriverUtil webdriverutil =new WebDriverUtil(driver);

webdriverutil.maxwindow();

webdriverutil.pageloadtimeout();
}
@BeforeMethod

public void login() throws Throwable  {

LoginPage loginpage=new LoginPage(driver);

loginpage.logintoApp();
}
@AfterMethod
public void logout() throws Throwable {
	HomePage  hp=new HomePage(driver);
	hp.logoutfromApp();
	
}
@AfterClass
public void CloseBrowser() throws InterruptedException {
	Thread.sleep(10000);
	driver.close();

}
}
