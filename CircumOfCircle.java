package Programs;

import java.util.Scanner;

public class CircumOfCircle 
{
	static void circle()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter pi value");
		double pi=s.nextDouble();
		System.out.println("Enter r value");
		int r=s.nextInt();
		double coc=2*pi*r;
		System.out.println("The circumference of he circle is " +coc);
		
	}

	public static void main(String[] args) 
	{
	 	circle();
	}

}
