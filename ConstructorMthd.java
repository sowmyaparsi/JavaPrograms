package Programs;

public class ConstructorMthd 
{
	ConstructorMthd()
	{
		System.out.println("Default Method");
	}
	ConstructorMthd(int a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		ConstructorMthd cm= new ConstructorMthd();
		//ConstructorMthd cm1= new ConstructorMthd(100);
		new ConstructorMthd(100);
	
		
		
	}

}
