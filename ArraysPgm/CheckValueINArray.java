package ArraysPgm;

import java.util.Scanner;

public class CheckValueINArray {

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
	 System.out.println("Enter the value to check in array");
	 int f=s.nextInt();
	 boolean b=false;
	 for(int i=0;i<size;i++)
		 if(a[i]==f)
		 {
			 b=true;
	 break;
		 }
	 if(b==true)
			 System.out.println("The element is "+f+" present in array");
		else
			System.out.println("The Element is" +f+ " not present in array");
	}

}
