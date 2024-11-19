package ArraysPgm;

import java.util.Arrays;

public class ArraysEqualPgm {

	public static void main(String[] args) 
	{
		int a[]=new int[3];
		a[0]=34;
		a[1]=45;
		a[2]=67;
		int b[]=new int[3];
		b[0]=34;
		b[1]=45;
		b[2]=67;
		if(Arrays.equals(a, b)==true)
			System.out.println("Both arrays are equal");
		else
			System.out.println("Both are not equal");
	}

}
