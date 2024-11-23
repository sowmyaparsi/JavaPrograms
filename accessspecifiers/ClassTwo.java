package accessspecifiers;

public class ClassTwo {

	protected void mul()
	{
		int a=5,b=3,c;
		c=a*b;
		System.out.println(c);

	}
	void div()
	{
		int a=4,b=2,c;
		c=a/b;
		System.out.println(c);

	}
	public void add()
	{
		int a=7,b=6,c;
		c=a+b;
		System.out.println(c);

	}
	private void sub()
	{
		int a=8,b=4,c;
		c=a-b;
		//return c;
		System.out.println(c);
	}

}
