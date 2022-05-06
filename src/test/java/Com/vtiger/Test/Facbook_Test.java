package Com.vtiger.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facbook_Test {
	
	@Test
	public void Facebook() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
//	driver.findElement(By.id("email")).sendKeys("soumyalatha07@gmail.com");
//	driver.findElement(By.id("passContainer")).sendKeys("arunsoumi14");
	 Thread.sleep(2000);
	    String title=driver.getTitle();
	   System.out.println(title);

}
}