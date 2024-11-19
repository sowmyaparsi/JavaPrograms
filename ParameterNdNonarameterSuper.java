package Programs;

class SuperOne
{
	SuperOne(String s)
	{
		System.out.println("The name is " +s);
	}
}
class SuperTwo extends SuperOne
{
	SuperTwo(int age)
	{
		super("sowmya");
		System.out.println("The age of the peerson is"+age);
	}
}
class SuperThree extends SuperTwo
{
	SuperThree(int m1,int m2)
	{
		super(25);
		int Total=m1+m2;
		System.out.println("Parameterizd super calling stmt and the total is " +Total);
	}
}	
public class ParameterNdNonarameterSuper extends SuperThree
{
	ParameterNdNonarameterSuper()
	{
		super(45,50);
		System.out.println("Main method constructor");	
	}
	public static void main(String[] args) 
	{
		new ParameterNdNonarameterSuper();
	}
}

