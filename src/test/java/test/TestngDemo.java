package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngDemo {
	@BeforeMethod
	public void before() {
		System.out.println("from before");
	}
	
	@AfterMethod
	public void after() {
		System.out.println("from after");
	}
	
	@Test
	public void tc1() {
		System.out.println("from tc1");
	}
	
	@Test
	public void tc2() {
		System.out.println("from tc2");
	}
	

}
