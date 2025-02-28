package test;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelDemo {
	
	@Parameters({"browser"})
	@Test
	public void tc1(String browser) {
		Reporter.log("browser used - " + browser);
	}

}
