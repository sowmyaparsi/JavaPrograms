package Programs;

import java.util.Scanner;

public class AreaofCricle 
{
	public AreaofCricle()
	{
		float pi=3.14f;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter r value");
		int r=s.nextInt();
		float aoc=pi*r*r;
		System.out.println("The area of circle is" +aoc);
	}
	
	public static void main(String[] args) 
	{
		AreaofCricle a= new AreaofCricle();
	}

}
