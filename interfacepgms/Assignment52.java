package interfacepgms;
interface College
{
	public int a=90;
	void classes();
	void labs();
	
}
public class Assignment52 implements College{

	public static void main(String[] args) {
		Assignment52 a=new Assignment52();
a.classes();
a.labs();

	}
public void classes()
{
	int b=2;
	int c=a*b;
	System.out.println("Consist of desk and board"+c);
}
public void labs()
{
	System.out.println("Consist of lab material");
}
}
