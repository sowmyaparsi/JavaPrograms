package typecasting;


class SuperMethod
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
class MethodTwo extends SuperMethod
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
public class Class_Typecasting extends MethodTwo
{
	void two()
	{
		System.out.println("Mian class method");
	}
	public static void main(String[] args) 
	{
		MethodTwo mt = new Class_Typecasting();
		if (mt instanceof Class_Typecasting) {
			Class_Typecasting sm = (Class_Typecasting)mt;
			sm.one();
			sm.three();
		}
		
	}

}
