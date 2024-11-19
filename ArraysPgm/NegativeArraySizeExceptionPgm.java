package ArraysPgm;

import java.util.Arrays;

public class NegativeArraySizeExceptionPgm {

	public static void main(String[] args) 
	{
		int a[]=new int[-6];
		a[0]=45;
		a[1]=56;
		a[2]=43;
		a[3]=78;
		//for (int i=0;i<=4;i++) array indexoutofbond exception
		System.out.println(Arrays.toString(a));
	}

}
