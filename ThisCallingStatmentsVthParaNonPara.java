package Programs;

public class ThisCallingStatmentsVthParaNonPara 
{
	ThisCallingStatmentsVthParaNonPara()
	{
		System.out.println("Default Constructor");
		System.out.println("Details of the student");
	}
	ThisCallingStatmentsVthParaNonPara(String a)
	{
		this();
		System.out.println("Parameter Constructor with String argument");
		System.out.println("Name of the student"+a);
	}
	ThisCallingStatmentsVthParaNonPara(int a,int b)
	{
		this("sowmya");
		System.out.println("Constructor with 2 arguments");
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args)
	{
		new ThisCallingStatmentsVthParaNonPara(45,50);
	}

}
