package Practise;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlesshtmlunitDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("http://amazon.in");
		System.out.println("Title of the page:"+driver.getTitle());
		System.out.println("The current URL of the page:"+driver.getCurrentUrl());
		
	}

}
