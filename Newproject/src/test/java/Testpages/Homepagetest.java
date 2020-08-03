package Testpages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Homepagetest {
	
	@BeforeTest
	public static void loginintoapplication() {
		System.out.println("successfully login");
		
	}
	
	@Test
	public void test1() {
		System.out.println(" verify the logo");
		System.out.println(" verify the homepage content");
		System.out.println(" verify  user profile");
	}
	
	
@BeforeTest
	
	public static void teardown() {
	System.out.println("successfully logout");
	
		
	}

}
