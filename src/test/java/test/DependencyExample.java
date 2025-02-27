package test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class DependencyExample {
	
	@Test()
	public void createUser() {
		System.out.println("from create user tc");
	}

	
	@Test(dependsOnMethods = {"createUser"})
	public void updateUser() {
		System.out.println("from update user tc");
	}

	
	@Test(dependsOnMethods = {"updateUser"})
	public void deleteUser() {
		System.out.println("from delete user tc");
	}
}


