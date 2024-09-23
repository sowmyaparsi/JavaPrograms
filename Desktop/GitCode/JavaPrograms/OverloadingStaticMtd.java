package Programs;

public class OverloadingStaticMtd {
	
	static void operator()
	{
		int a=590,b=440;
		int c=a+b;
		System.out.println("Overloading method with no parameters and the addition of two numbers is " +c);
	}
	static void operator(int a, int b)
	{
		int c=a-b;
		System.out.println("Overloading method with two interger parameter and the subsraction is " +c);
	}
	static void operator(int a, int b, int c)
	{
		int mul=a*b*c;
		System.out.println("Overloading method with 3 integer parameter and the multiplication is "+mul);
	}
	static void operator(int a, String s)
	{
		System.out.println("Overloading method with 1 integer and 1 string parameter ");
		System.out.println("The value of a is" +a);
		System.out.println("The String is " +s);
	}
	public static void main(String[] args) 
	{
	operator();
	operator(22,89);
	operator(6,3,9);
	operator(45,"sowmya");
	}
}
