package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	
	@Test(expectedExceptions = {NullPointerException.class, ArithmeticException.class})
	public void searchTest() {
		System.out.println("searchTest");
		int i = 9/0;
		System.out.println("bye");
	}
	
	

}
