package Groups_Test;

import org.testng.annotations.Test;

public class Test_S2 extends BaseClass{
	
	
	
	@Test(groups= {"Regression"})
	public void p1() {
		System.out.println("p1");
	}

	@Test(groups= {"Sanity"})
	public void p2() {
		System.out.println("p2");
	}
	
	@Test(groups= {"Regression"})
	public void p3() {
		System.out.println("p3");
	}
	
}
