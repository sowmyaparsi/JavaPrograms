package whileLooppgms;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int i=1,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter factorial number");
		int a=s.nextInt();	
	
		while(i<=a)
		{
			fact=fact*i;
			i++;
			System.out.println(fact);
		}
		System.out.println("The factorial of number is "+fact);

	}

}
