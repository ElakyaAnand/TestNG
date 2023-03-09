package practisingtestng;

import org.testng.annotations.Test;

public class SkippingTest {

	@Test(enabled = false)
	public void failurestestcase()
	{
		System.out.println("skip the failures");
	}
	
	@Test
	public void regressiontest()

	{
		System.out.println("Regression testing");
	}
	
	@Test
	public void sanitytest()
	{
		System.out.println("Sanity testing");
	}
}
