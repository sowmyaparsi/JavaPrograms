package AbstractClassPgms;

class StdPersonaldetail
{
	void basicinfo()
	{
		String name="Sowmya";
		int stdid=111;
		System.out.println("The student name is" +name);
		System.out.println("The student id is" +stdid);
	}
	void parentdetails()
	{
		String fname="Srinivas";
		String mname="Manjula";
		System.out.println("Father name is"+fname);
		System.out.println("Mother name is"+mname);
	}
}
abstract class StdEducationdetails extends StdPersonaldetail
{
	int m1=78,m2=67;
	abstract void marks();
	abstract void totalmarks();
	void averagemarks()
	{
		double avg;
		avg=(m1+m2)/2;
		System.out.println("Average marks is "+avg);
	}
	void grade()
	{
		System.out.println("The grade is first");
	}
}
public class CominationFAbstractClsNdConcretecls extends StdEducationdetails
{
	int m1=78,m2=67;
	void marks()
	{
		System.out.println("The marks m1 is"+m1);
		System.out.println("The marks m2 is "+m2);
	}
	void totalmarks()
	{
		int tot=m1+m2;
		System.out.println("The total marks is"+tot);		
	}
	public static void main(String[] args) 
	{
		CominationFAbstractClsNdConcretecls ac=new CominationFAbstractClsNdConcretecls();
		ac.basicinfo();
		ac.parentdetails();
		ac.marks();
		ac.averagemarks();
		ac.totalmarks();
		ac.grade();
	}

}
