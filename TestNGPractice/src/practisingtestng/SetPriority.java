package practisingtestng;

import org.testng.annotations.Test;

public class SetPriority {
	
	@Test(priority = 2)
	public void learning()
	{
		System.out.println("Keep learning to reach better place");
	}
	
	
	@Test(priority = 3)
	public void food()
	{
		System.out.println("The food is essentail");
	}
	
	
	@Test(priority = 1)
	public void games()
	{
		System.out.println("Games can improved the physical fittness");
	}

}
