package Programs;

import java.util.Scanner;

public class AreafRectangle {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of l");
		int l=s.nextInt();
		System.out.println("Enter the value of b");
		int b=s.nextInt();
		int aor=l*b;
		System.out.println("The area of square is" +aor);
		
	}

}
