package Groups_Test;

import org.testng.annotations.Test;

public class Test_S3 extends BaseClass{

	
	@Test(groups= {"Sanity"})
	public void a1() {
		System.out.println("A1");
	}
}
