package Programs;

public class MainMethod {

	public static void main(String[] args) 
	{
System.out.println("Main method");
MainMethod m=new MainMethod();
m.main();
m.main(2, 3);
m.main("Sony", "sowmya");
//main(args);
	}
	public void main()
	{
		System.out.println("Main 1");
	}
	public void main(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void main(String a, String b)
	{
		System.out.println("String method");
	}
	

}
