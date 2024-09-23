package Programs;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s.nextInt();
		int aos=a*a;
		System.out.println("The area of square is" +aos);
		
	}

}
