package ArraysPgm;

import java.util.Scanner;

public class AcceptArrayValuesRuntym {

	public static void main(String[] args) 
	{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the Array size");
			int size=s.nextInt();
			int a[]=new int[size];
			System.out.println("Enter "+size+" values in array");
			for(int i=0;i<size;i++)
				a[i]=s.nextInt();
			for(int i=0;i<size;i++)
				System.out.println("The values in" +i+ " position is " +a[i]);	
			s.close();
	}

}
