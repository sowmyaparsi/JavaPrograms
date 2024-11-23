package Programs;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a and b value");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Enter operation to perform 1.Add 2.Sub 3.mul 4.div");
		int o=s.nextInt();
		int c;
		switch(o)
		{
		case 1:
			c=a+b;
			System.out.println("The addition of 2 numbers"+c);
			break;
		case 2:
			c=a-b;
			System.out.println("The substraction of 2 numbers  "+c);
			break;
		case 3:
			c=a*b;
			System.out.println("The addition of 2 numbers  " +c);
			break;
		case 4:
			c=a/b;
			System.out.println("The addition of 2 numbers  " +c);
			break;
		default:
			System.out.println("Enter correct option");
		}
		
	}

}
