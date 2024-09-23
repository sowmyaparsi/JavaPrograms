package Programs;

public class OperatorNonStatic {
		void addition() 
	{
		int a=300,b=400;
		int add=a+b;
		System.out.println("The addition of two number is " +add);}
		void substraction() 
	{
		int a=300,b=400;
		int sub=b-a;
		System.out.println("The substraction of two number is " +sub);}
	void muliplication() 
	{
		int a=300,b=400;
		int mul=a*b;
		System.out.println("The multiplication of two number is " +mul);}
	void division() 
	{
		int a=300,b=4;
		double div=a/b;
		System.out.println("The division of two number is " +div);}
	void modulus() 
	{
		int a=300,b=4;
		double mod=a%4;
		System.out.println("The modulus of two number is " +mod);}
	public static void main(String[] args) 
	{
		OperatorNonStatic on=new OperatorNonStatic();
		on.addition();
		on.substraction();
		on.muliplication();
		on.division();
		on.modulus();
	}

}
