package Rahul_Udemy;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {

	@Test(priority=1)
	public void ploan() {
		System.out.println("good");
	}
	
	@BeforeTest
	public void prerequest() {
		System.out.println("I will execute first");
	}
}
