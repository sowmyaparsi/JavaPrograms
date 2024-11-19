package Programs;
class Printname
{
	Printname()
	{
		System.out.println("Name of Student=Sowmya");
	}
}
class Printmarks extends Printname
{
	Printmarks()
	{
		super();
		System.out.println("Marks of two subjects:35,45");
		//System.out.println(b);
	}
}
public class TestCase1 extends Printmarks
{
	TestCase1()
	{
		super();
		System.out.println("Thanks for details");
	}

	public static void main(String[] args) 
	{
		new TestCase1();
	}

}
