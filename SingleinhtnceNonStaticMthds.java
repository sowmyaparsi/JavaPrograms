package Programs;

class One
{
	static int a=1000;
	int b=300;
	void add()
	{
		int c=a+b;
		System.out.println("The addition of two number is " +c);
	}
	void sub()
	{
		int c=a-b;
		System.out.println("The substraction of two number is " +c);
	}
}
public class SingleinhtnceNonStaticMthds extends One
{
	static int a=1000;
	int b=300;
	void mul()
	{
		int c=a*b;
		System.out.println("The multiplication of two number is " +c);
	}
	void div()
	{
		double c=a/b;
		System.out.println("The addition of two number is " +c);
	}	
public static void main(String[] args) 
{
	SingleinhtnceNonStaticMthds s=new SingleinhtnceNonStaticMthds();
	s.add();
	s.sub();
	s.mul();
	s.div();
	}
}
