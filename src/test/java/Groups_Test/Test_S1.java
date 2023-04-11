package Groups_Test;

import org.testng.annotations.Test;

public class Test_S1 {
	
	
	@Test(groups= {"Sanity"})
	public void m1() {
		System.out.println("m1");
	}
	
	@Test(groups= {"Regression"})
	public void m2() {
		System.out.println("m2");
	}
	
	@Test(groups= {"Sanity"})
	public void m3() {
		System.out.println("m3");
	}

}
