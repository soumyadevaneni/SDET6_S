package Rahul_Udemy;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3 {

	@Test
	public void WebloginHomeloan() {
		System.out.println("Webloginhome");
	}
	
	
	
 @BeforeMethod
 public void beforeevery() {
	 System.out.println("I will execute before every test method in day 3 class");
 }
 
 @AfterMethod
 
 public void afterevery() {
	System.out.println("I will execute after every test method in day 3 class"); 
 }
}
