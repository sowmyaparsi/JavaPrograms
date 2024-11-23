package accessspecifiers;

public class AllAaccessSpecifiers {

	public static void main(String[] args) 
	{
		AllAaccessSpecifiers a=new AllAaccessSpecifiers();
		System.out.println(a.add());
		System.out.println(a.sub());
		System.out.println(a.mul());
		System.out.println(a.div());
		
	}
	public int add()
	{
		int a=7,b=6,c;
		c=a+b;
		return c;
	}
	private int sub()
	{
		int a=8,b=4,c;
		c=a-b;
		return c;
		//System.out.println(c);
	}
	protected int mul()
	{
		int a=5,b=3,c;
		c=a*b;
		return c;
	}
	int div()
	{
		int a=4,b=2,c;
		c=a/b;
		return c;
	}
}

