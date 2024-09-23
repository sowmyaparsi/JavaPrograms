package Programs;

import java.util.Scanner;

public class AreaOCircleMath {

	public static void main(String[] args) 
	{
 
 Scanner s1=new Scanner(System.in);
 System.out.println("Enter the r value");
 int r= s1.nextInt();
 double aoc=Math.PI*r*r;
 System.out.println("The area of circle is " +aoc);
	}

}
