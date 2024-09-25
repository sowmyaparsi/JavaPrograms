package Programs;
class Class1
{
	static String name="Sowmya";
	static void printname()
	{
		System.out.println("The is " +name);
	}
}
class Class2 extends Class1
{
	int num=123456;
	 void printnumber()
	{
		System.out.println("The number is "+num);
	}
}
class Class3 extends Class2
{
	static int m1=40;
	int m2=45;
	//int m3=0;
	static void printmarks()
	{
		int m3=0;
		MultilevelVStaticNdNonStaticMhds m=new MultilevelVStaticNdNonStaticMhds();
		m3=m1+m.m2;
		System.out.println("The total marks is "+m3);
	}	
}
public class MultilevelVStaticNdNonStaticMhds extends Class3
{
	public static void main(String[] args)
	{
		MultilevelVStaticNdNonStaticMhds m1=new MultilevelVStaticNdNonStaticMhds();
		printname();
		m1.printnumber();
		printmarks();
	}

}
