package typecasting;
class ParentMtd
{
	void one()
	{
		System.out.println("Print superclass method");
	}
	void three()
	{
		System.out.println("Supermethod");
	}
}
class ChildMtd extends ParentMtd
{
	void one()
	{
		System.out.println("Print MethodTwo class method");
	}
	void two()
	{
		System.out.println("Submethod");
	}
}
public class DownCasting extends ChildMtd
{
	void two1()
	{
		System.out.println("Mian class method");
	}
	public static void main(String[] args) 
	{
		ParentMtd sm=new ParentMtd();
		ChildMtd mt=(ChildMtd) sm;
	mt.one();
	//mt.two();
	mt.three();
	}

}
