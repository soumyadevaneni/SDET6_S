package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefoxheadlessbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         FirefoxOptions options=new FirefoxOptions();
		 
		   // options.setHeadless(true);
		    options.addArguments("--headless");
			WebDriverManager.firefoxdriver().setup();
			WebDriver	driver = new FirefoxDriver(options);
			driver.get("http://amazon.in");
		  System.out.println("Title of the page:"+ driver.getTitle());
		  
	}

}
