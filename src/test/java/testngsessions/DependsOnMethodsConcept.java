package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {
	
	//AAA in unit test
	//Arrange, Act, and Assert 
	
	public void createAUser() {
		System.out.println("creating a user");
	}
	
	@Test
	public void a_createUser() {
		System.out.println("create user");//100
		createAUser();//100
		//int i = 9/0;
	}
	
//	@Test(dependsOnMethods = "a_createUser")
//	public void updateUser() {
//		System.out.println("update user");
//
//	}
//	
//	@Test(dependsOnMethods = "a_createUser")
//	public void deleteUser() {
//		System.out.println("delete user");
//
//	}
	
	@Test()
	public void updateUser() {
		createAUser();//101
		System.out.println("update user");//101

	}
	
	@Test()
	public void deleteUser() {
		createAUser();//201
		System.out.println("delete user");//201

	}
	
	

}
