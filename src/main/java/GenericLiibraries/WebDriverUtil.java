package GenericLiibraries;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtil {

	WebDriver driver;
	public  WebDriverUtil(WebDriver driver) {
		this.driver=driver;
	}
	public void Webdriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public void maxwindow() {
		driver.manage().window().maximize();
	}
	public void pageloadtimeout() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public boolean elementIsDisplayed(WebElement element) {
		return element.isDisplayed();
		
	}
	public boolean elementIsSelected(WebElement element) {
		return element.isSelected();
		
	}
	public void elementIsClickable(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	public void elementIsvisible(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element)).click();
	}
	public void selectvaluefrom(WebElement element,int index) {
		Select select=new Select(element);
				select.selectByIndex(index);
	}
	public void selectvaluefrom(WebElement element ,String value) {
		Select select =new Select(element);
		select.selectByValue(value);
	}
	public void selectvaluefrom(String text,WebElement element) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	public void movetoElement(WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	public void dragandDrop(WebElement src,WebElement dest) {
		Actions action=new Actions(driver);
		action.dragAndDrop(src, dest).build().perform();
	}
	public void dragandDrop(WebElement element) {
		Actions action=new Actions(driver);
		action.doubleClick().build().perform();
	}
	public void rightclick(WebElement element) {
		Actions action=new Actions(driver);
		action.contextClick().build().perform();
	}
	public void scrolltoelement(WebElement element) {
		      JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("arguments[0].scrollIntoview;",element);
	}
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}
	public void sendkeysAlert(String text) {
		driver.switchTo().alert().sendKeys(text);
	}
	public void switchwindow(String title) {
		Set<String>winids=driver.getWindowHandles();
		Iterator<String>it=winids.iterator();
		for(String id:winids)
		{
			driver.switchTo().window(id);
			if(title.equalsIgnoreCase(driver.getTitle())) {
				break;
			}
		}
	}
	
}
