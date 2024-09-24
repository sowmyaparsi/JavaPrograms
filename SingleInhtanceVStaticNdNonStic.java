package Programs;
class DerivedClass
{
	static int a=20;
	int b=10;
	static void add()
	{
		SingleInhtanceVStaticNdNonStic s= new SingleInhtanceVStaticNdNonStic();
		int c=a+s.b;
		System.out.println("The addition of 2 numbers"+c);
	}
	void sub()
	{
		int c=a-b;
		System.out.println("The substraction of 2 numbers"+c);
	}
}

public class SingleInhtanceVStaticNdNonStic extends DerivedClass
{
	static int a=20;
	int b=10;
	static void mul()
	{
		SingleInhtanceVStaticNdNonStic s1= new SingleInhtanceVStaticNdNonStic();

		int c=a*s1.b;
		System.out.println("The multipplication of 2 numbers" +c);
	}
	void div()
	{
		int c=a/b;
		System.out.println("The division of 2 numbers"+c);
	}
	public static void main(String[] args) 
	{
		SingleInhtanceVStaticNdNonStic s2= new SingleInhtanceVStaticNdNonStic();
        s2.add();
        s2.sub();
        s2.mul();
        s2.div();

	}

}
