package Com.vtiger.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class vtiger {
	
  @Test
	public void vtiger() throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://localhost:8888");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
   Thread.sleep(2000);
    String title=driver.getTitle();
   System.out.println(title);
	}

}
