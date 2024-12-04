package testngprograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationProgrm 
{
	@BeforeSuite
	public void bs()
	{
		System.out.println("BS");
	}
	@BeforeClass()
	public void bc()
	{
		System.out.println("BC");
	}

	@BeforeMethod
	public void bm()
	{
		System.out.println("BM");

	}
	@BeforeTest()
	public void bt()
	{
		System.out.println("BT");

	}
	@Test
	public void Test1()
	{
		System.out.println("Testcase 1");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("Am");
	}
@AfterClass
public void ac()
{
	System.out.println("Ac");
}
@Test
public void Testtwo()
{
	System.out.println("Testcase 2");
}
@AfterTest
public void at()
{
	System.out.println("AT");
}
@AfterSuite
public void as()
{
	System.out.println("AS");
}
}
