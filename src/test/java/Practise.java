import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practise {

	public static void main(String[] args) {
		
	    ChromeOptions options=new ChromeOptions();
	   // options.setHeadless(true);
	    options.addArguments("--headless");
		WebDriverManager.chromedriver().setup();
		WebDriver	driver = new ChromeDriver(options);
		driver.get("http://amazon.in");
	  System.out.println("Title of the page:"+ driver.getTitle());
	  

	}

}
