package AbstractClassPgms;

abstract class Parentpgm
{
	abstract void personaldetails();
	void salarydetails()
	{
		int sal=30000;
		System.out.println("The salary is "+sal);
	}
}

public class AbstractclsndConcreteClspgm extends Parentpgm
{
	String name="Sowmya";
	int eid=123;
	void personaldetails()
	{
		System.out.println("The employee name is" +name);
		System.out.println("The employee id is "+eid);
		
	}
	public static void main(String[] args) 
	{
		AbstractclsndConcreteClspgm as=new AbstractclsndConcreteClspgm();
		as.personaldetails();
		as.salarydetails();
		
	}

}
