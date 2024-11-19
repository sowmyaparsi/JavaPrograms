package Programs;
class SuperClass
{
	public void square()
	{
		int a=6,aoc;
		aoc=a*a;
		System.out.println("Area of square "+aoc);
	}
	
}

public class SuperKeyword extends SuperClass
{
	public void square()
	{
		int a=10,aop;
		aop=4*a;
		System.out.println("Perimeter of square "+aop);
		super.square();
	}
	public static void main(String[] args) 
	{
		SuperKeyword s= new SuperKeyword();
		s.square();
	}

}
