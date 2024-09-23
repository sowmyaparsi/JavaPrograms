package Programs;

import java.util.Scanner;

public class Nestedifcond
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s.nextInt();
		System.out.println("Enter the value of b");
		int b=s.nextInt();
		System.out.println("Enter the value of c");
		int c=s.nextInt();
		//int a=100,b=200,c=180;
		//char gender='M';
		//char gender2='F';
		if(a>b && a>c)
			System.out.println("a is biggest number");
		else if(b>a && b>c)
			System.out.println("b is biggest number");
		else 
			System.out.println("c is biggest number");
	}

}
