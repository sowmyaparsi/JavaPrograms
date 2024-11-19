package Programs;

class Reporting
{
	Reporting()
	{
		System.out.println("Reporting");
	}
}
class Screenshot extends Reporting
{
	Screenshot()
	{
		System.out.println("Screenshot");
	}
}
public class SuperCallingStmtClass extends Screenshot
{
	SuperCallingStmtClass()
	{
		super();
		System.out.println("TestCase");
	}

	public static void main(String[] args) 
	{
		new SuperCallingStmtClass();
	}

}
