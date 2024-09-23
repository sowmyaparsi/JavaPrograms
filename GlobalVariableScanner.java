package Programs;

import java.util.Scanner;

public class GlobalVariableScanner {
	
	Scanner s=new Scanner(System.in);
	//System.out.println("Enter the a value");
	int a =s.nextInt();
	//System.out.println("Enter the b value");
	int b =s.nextInt();
	void addition()
	{
		int c=a+b;
		System.out.println("Adition of two numbers is"+c);	
	}
	void substraction()
	{
		int c=b-a;
		System.out.println("Substraction of 2 numbers is"+c);
	}
	void multiplication()
	{
		int c=b*a;
		System.out.println("Multiplication of 2 numbers is "+c);
	}
	void division()
	{
		int c=b/a;
		System.out.println("Division of 2 numbers is "+c);

	}
	void modulus()
	{
		int c=b%a;
		System.out.println("modulus of 2 numbers is "+c);

	}
	void updatevalue()
	{
		int a=20;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the a and bvalues");
		GlobalVariableScanner gv= new GlobalVariableScanner();
		gv.addition();
		gv.substraction();
		gv.multiplication();
		gv.division();
		gv.modulus();
		gv.updatevalue();
		int a=40;
		System.out.println(a);
		
		//System.out.println(gv.a);
		
	}

}
