package Com.Bluestone;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class com_Bluestone_test8 {

	@Test
	public void com_Bluestone_test8() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		 WebElement  av=driver.findElement(By.xpath("//a[text()='All Jewellery ']"));
	   Thread.sleep(2000);
	   Actions ac=new Actions(driver);
		ac.moveToElement(av).perform();
		driver.findElement(By.xpath("//a[text()='Kadas']")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("window.scrollBy(0,450)");
			 Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@class=\"hc img-responsive center-block\"]")).click();
	Thread.sleep(2000);
	Set<String> handles = driver.getWindowHandles();
	
	Iterator<String> id = handles.iterator();
	String p = id.next();
	String c = id.next();
	Thread.sleep(2000);
    driver.switchTo().window(c);
	JavascriptExecutor js1 = (JavascriptExecutor)driver;
	 js1.executeScript("window.scrollBy(0,400)");
	 Thread.sleep(2000);

  	
	driver.findElement(By.xpath("//span[@class=\"icon-ion-android-arrow-dropdown\"]")).click();
	WebElement size=driver.findElement(By.xpath("//span[text()='2-6(2 6/16\")']"));
	String avv=size.getText();
	size.click();
	Thread.sleep(2000);
	driver.findElement(By.id("buy-now")).click();
	Thread.sleep(2000);
	String cartsize=driver.findElement(By.xpath("//span[@class=\"ring-size-box\"]")).getText();
	if(avv.equals(cartsize))
	{
		System.out.println("size is same");
	}
   driver.close();
     
	
	

		 

	}
}
