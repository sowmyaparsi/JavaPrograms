package Programs;

import java.util.Scanner;

public class AreaOfTriangle 
{
	
	void triangle()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value of b");
		int b=s.nextInt();
		System.out.println("Enter the value of h");
		int h=s.nextInt();
		double aot=0.5*b*h;
		System.out.println("Area of Traingle is " +aot);
		
	}

	public static void main(String[] args) 
	{
		AreaOfTriangle a =new AreaOfTriangle();
		a.triangle();

	}

}
