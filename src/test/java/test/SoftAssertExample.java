package test;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

	@Test
	public void tc1() {
		SoftAssert sa = new SoftAssert();
		int a = 15;
		Reporter.log("a = " + a);
		sa.assertTrue(a<=5, "The value 'a' is greater than 5,");
		System.out.println("from tc-1");
		sa.assertAll();
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
