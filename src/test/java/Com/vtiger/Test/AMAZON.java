package Com.vtiger.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AMAZON {
	@Test
	public void amazon() {
		WebDriverManager.chromedriver().setup();
		WebDriver	driver = new ChromeDriver();
		driver.get("http://amazon.in");
		System.out.println(driver.getTitle());
	}
}