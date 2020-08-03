package Testpages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginpagetest {
	
	@BeforeTest
	
	public static void loginintoapplication() {
		System.out.println("successfully login");
		
	}
	
	@Test
	public void test1() {
		System.out.println(" verify the logo");
		
	}
	
	
@BeforeTest
	
	public static void teardown() {
	System.out.println("successfully logout");
	
		
	}
	
}
