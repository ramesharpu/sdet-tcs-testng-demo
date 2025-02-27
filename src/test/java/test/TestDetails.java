package test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestDetails {
	
	@Test(description = "Valid username and valid password test")
	public void validUsernameValidPasswordTest() {
		System.out.println("test output");
	}

	@Test
	public void tc1() {
		System.out.println("from tc-1");
	}
	
	//bug-id: 12536
	@Test(enabled = false)
	public void tc2() {
		assertTrue(false);
		System.out.println("from tc-2");
	}
	
}
