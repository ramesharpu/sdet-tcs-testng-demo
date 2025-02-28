package test;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
	
	@Parameters({"validUsername", "validPassword"})
	@Test
	public void validUsernameValidPasswordTest(String username, String password) {
		Reporter.log("username = " + username);
		Reporter.log("password = " + password);
	}
	
	@Parameters({"invalidUsername", "validPassword"})
	@Test
	public void invalidUsernameValidPasswordTest(String username, String password) {
		Reporter.log("username = " + username);
		Reporter.log("password = " + password);
	}
	
	@Parameters({"validUsername", "invalidPassword"})
	@Test
	public void validUsernameInvalidPasswordTest(String username, String password) {
		Reporter.log("username = " + username);
		Reporter.log("password = " + password);
	}
	
	@Parameters({"invalidUsername", "invalidPassword"})
	@Test
	public void invalidUsernameInvalidPasswordTest(String username, String password) {
		Reporter.log("username = " + username);
		Reporter.log("password = " + password);
	}
	
	@Parameters({"validPassword"})
	@Test
	public void blankUsernameValidPasswordTest(String password) {
		String username = "";
		Reporter.log("username = " + username);
		Reporter.log("password = " + password);
	}
	
	
	@Parameters({"validUsername"})
	@Test
	public void validUsernameBlankPasswordTest(String username) {
		String password = "";
		Reporter.log("username = " + username);
		Reporter.log("password = " + password);
	}
	
	
	@Test
	public void blankUsernameBlankPasswordTest() {
		String username = "";
		String password = "";
		Reporter.log("username = " + username);
		Reporter.log("password = " + password);
	}
	

}
