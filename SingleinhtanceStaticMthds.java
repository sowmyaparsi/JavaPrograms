package Programs;


class AddndSubMthds
{
    static int a=10,b=20;
	static void add()
	{
		int c=a+b;
		System.out.println("The super class methods are ");
		System.out.println("The addition of 2 numbers is " +c);
	}
	static void sub()
	{
		int c=b-a;
		System.out.println("The substraction of two numbers is " +c);
	}
	
}

public class SingleinhtanceStaticMthds extends AddndSubMthds
{
	static int a=10,b=20;
	static void mul()
	{
		int c=a*b;
		System.out.println("The sub class methods are ");
		System.out.println("The multiplication of two number is " +c);
	}
	static void div()
	{
		int c=b/a;
		//System.out.println("The sub class methods are ");
		System.out.println("The division of two number is " +c);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();

	}

}
