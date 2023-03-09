package practisingtestng;

import org.testng.annotations.Test;

public class HandlingDependencies {
	
	@Test(enabled=true)
	public void bahvtest()
	{
		System.out.println("The bhav test");
	}
	
	@Test(dependsOnMethods = "bahvtest")
	public void volumeexcel()
	{
		System.out.println("Volme values");
	}
	
	
	@Test(dependsOnMethods = "volumeexcel")
	public void returnexcel()
	{
		System.out.println("Return values");
	}

}
