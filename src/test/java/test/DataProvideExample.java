package test;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class DataProvideExample {
  @Test(dataProvider = "dp")
  public void loginValidation(String username, String password) {
		Reporter.log("username = " + username);
		Reporter.log("password = " + password);
	}

  @DataProvider
  public String[][] dp() {
    return new String[][] {
      new String[] { "dan@gmail.com", "test1234" },
      new String[] { "invalid-dan@gmail.com", "test1234" },
      new String[] { "dan@gmail.com", "invalid-test1234" },
      new String[] { "invalid-dan@gmail.com", "invalid-test1234" },
      new String[] { "", "test1234" },
      new String[] { "dan@gmail.com", "" },
      new String[] { "", "" },
      
      
    };
  }
}
