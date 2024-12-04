package testngprograms;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations2 
{
	@AfterSuite(enabled=false)
	public void teste1()
	{
		System.out.println("Teste1");
	}
	@Test
	public void testcase4()
	{
		System.out.println("Testcase1");
	}
	@Test
	public void testcase5()
	{
		System.out.println("Testcase2");
	}
	@AfterMethod
	public void tesete2()
	{
		System.out.println("Teste2");
	}
	
}
