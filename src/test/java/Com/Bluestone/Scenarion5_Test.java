package Com.Bluestone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenarion5_Test {
	@Test
	public void Scenarion5_Test() throws Throwable {
		
	
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.bluestone.com/");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.id("denyBtn")).click();
    WebElement  av=driver.findElement(By.xpath("//a[text()='Rings ']"));
    Thread.sleep(2000);
    Actions ac=new Actions(driver);
	ac.moveToElement(av).perform();
	driver.findElement(By.xpath("//a[text()='Diamond']")).click();
	JavascriptExecutor  jse		 = (JavascriptExecutor)driver;  
	 jse.executeScript("window.scrollBy(0,2000)");
//WebElement ring=driver.findElement(By.xpath("//i[@class=\"icon-ion-chevron-down\"]"));
//Thread.sleep(2000);
//Actions ac1=new Actions(driver);
//	ac1.moveToElement(ring).perform();
//	WebElement price=driver.findElement(By.xpath("//a[@target=\"_blank\"]"));
//	price.click();
	List<WebElement> price2 = driver.findElements(By.xpath("//span[@class=\"new-price\"]"));
    for(int i=0;i<price2.size();i++)
    {
    	System.out.println(price2.get(i).getText());
    }
     Thread.sleep(2000);
 WebElement vs=   driver.findElement(By.xpath("//span[@class=\"view-by-wrap title style-outline i-right\"]"));
 Actions ac1=new Actions(driver);
	ac1.moveToElement(vs).perform();
    driver.findElement(By.xpath("//a[text()='Price Low to High ']")).click();
    List<WebElement> price21 = driver.findElements(By.id("//span[@id=\"bst-discounted-price\"]"));
    for(int i=0;i<price21.size();i++)
    {
    	System.out.println(price21.get(i).getText());
    }
 

}
	
	
}