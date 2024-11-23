package interfacepgms;
interface Hiding
{
	abstract void add();
	abstract void sub();
	
}
abstract class AbstcctMthdsNdConcreteMthd implements Hiding
{
	abstract void mul();
	abstract void div();
	public void add()
	{
		int a=5,b=5,c;
		c=a+b;
		System.out.println("Add is"+c);
	}
	public void sub()p
	{
		int a=8,b=4;
		int c=a-b;
		System.out.println("Sub is"+c);
	}
}

public class Assignment51 extends AbstcctMthdsNdConcreteMthd
{

	public static void main(String[] args) 
	{
Assignment51 a=new Assignment51();
a.add();
a.sub();
a.mul();
a.div();


	}
void mul()
{
	int a=3,b=4;
	int c=a*b;
	System.out.println("Mul is"+c);
}
void div()
{
	int a=8,b=4;
	int c=a/b;
	System.out.println("Div is"+c);
}
}
