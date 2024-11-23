package typecasting;
class Sample1
{
	//static int a=10;
	//a=20;
	void add()
	{
		System.out.println(a);
		System.out.println("Print");
	}
}
class sample2 extends Sample1
{
	void sub()
	{
		System.out.println("Print1");
	}
}
public class SampeTypeCassting extends sample2{
void mul()
{
	System.out.println(("print3"));
}
	public static void main(String[] args) 
	{
		sample2 s1=new sample2();
		Sample1 s2=s1;
		//sample2 s3=(sample2)s2;
		s2.add();
		//s2.sub();`
		
		
	
		
	}

}
