package practisingtestng;

import org.testng.annotations.Test;

public class GroupingTestingCases {
	
	
	@Test(groups = "Testing")
	public void manualtesting()
	{
		System.out.println("writing testcases in excel sheet");
	}
	
	@Test(groups = "Testing")
	public void automationtesting()
	{
		System.out.println("writing test cases in selenium");
	}
	
	@Test(groups = "Testing")
	public void apitesting()
	{
		System.out.println("using postman");
	}
	
	@Test(groups = "Developing")
	public void java()
	{
		System.out.println("Java developing");
	}
	
	@Test(groups = "Developing")
	public void Net()
	{
		System.out.println("Net developing");
	}

	@Test(groups = "Developing")
	public void pyton()
	{
		System.out.println("pyton developing");
	}
}
