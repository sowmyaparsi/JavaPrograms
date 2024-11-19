package interfacepgms;
interface Parent1
{
	void add();
}
interface Parent2
{
	void substract();
}

public class MultipleinheritancePgm implements Parent1,Parent2
{
	int a=80,b=40;
	public void add()
	{
		int c=a+b;
		System.out.println("The addition of two numbers"+c);
	}
	 public void substract()
	{
		int c=a-b;
		System.out.println("The substraction is "+c);
	}

	public static void main(String[] args) 
	{
		MultipleinheritancePgm mp=new MultipleinheritancePgm();
		mp.add();
		mp.substract();
	}

}
