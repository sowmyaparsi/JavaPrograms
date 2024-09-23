package Programs;

public class OverloadingNonStaticMtd {
	void operator()
	{
		int a=40, b=456;
		int c=a+b;
		System.out.println("Overloading method with no parameter and the addition of 2 numbers is  " +c);
	}
	void operator(int a, int b)
	{
		int c= a*b;
		System.out.println("Overloading with 2 parameters and the multiplication is " +c);
	}
	void operator(int a, double b)
	{
		double c=a/b;
		System.out.println("Overloadig with 2 parameters and the division is "+c);
	}
	void operator( int a,String s,char c)
	{
		System.out.println("Overloading with 3 different parameters");
		System.out.println(a);
		System.out.println(s);
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		OverloadingNonStaticMtd ons=new OverloadingNonStaticMtd();
		ons.operator();
		ons.operator(23, 4);
		ons.operator(5, 2.9);
		ons.operator(56, "sowmya", 'z');
	}
}
