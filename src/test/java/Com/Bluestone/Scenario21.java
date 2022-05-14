package Com.Bluestone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario21 {

	@Test
	public void Scenario21() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		 	
		driver.findElement(By.name("search_query")).sendKeys("rings");
		driver.findElement(By.name("submit_search")).click();
		WebElement ring=driver.findElement(By.xpath("//i[@class=\"icon-ion-chevron-down\"]"));
		Thread.sleep(2000);
		Actions ac1=new Actions(driver);
		ac1.moveToElement(ring).perform();
	  WebElement  price= driver.findElement(By.xpath("//span[@data-displayname=\"below rs 10000\"]"));
	  for(int i=0;i<price.size();i++)
	    {
	    	System.out.println(price.get(i).getText());
	    }
	}
}
