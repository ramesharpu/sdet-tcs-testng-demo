package test;

import org.testng.annotations.Test;

@Test(groups = {"regression"})//default group
public class GroupDemo {
	
	@Test
	public void tc1() {
		System.out.println("from tc-1");
	}
	
	@Test(groups = {"smoke"})
	public void tc2() {
		System.out.println("from tc-2");
	}
	
	@Test
	public void tc3() {
		System.out.println("from tc-3");
	}
	
	@Test(groups = {"smoke"})
	public void tc4() {
		System.out.println("from tc-4");
	}
	
	@Test(groups = {"bug"})
	public void tc5() {
		System.out.println("from tc-5");
	}

}
