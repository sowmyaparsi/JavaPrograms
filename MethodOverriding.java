package Programs;
class ParentClass
{
	void area()
	{
		double pi=Math.PI,poc;
		int r=10;
		poc=2*pi*r;
		System.out.println("circumference of circle is " +poc);
	}
}

public class MethodOverriding extends ParentClass
{
	void area()
	{
		double pi=Math.PI,aoc;
		int r=10;
		aoc=pi*r*r;
		System.out.println("Area of circle is " +aoc);
		//System.out.println("Enter Password");
	}
	public static void main(String[] args)
	{
		MethodOverriding m=new MethodOverriding();
		m.area();
	}

}
