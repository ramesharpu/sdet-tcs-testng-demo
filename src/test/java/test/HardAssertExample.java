package test;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertExample {

	@Test
	public void tc1() {
		int a = 15;
		Reporter.log("a = " + a);
		assertTrue(a<=5, "The value 'a' is greater than 5,");
		System.out.println("from tc-1");
	}
	
	@Test
	public void tc2() {
		System.out.println("from tc-2");
	}
	
	@Test
	public void tc3() {
		System.out.println("from tc-3");
	}
	
}
