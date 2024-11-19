package ArraysPgm;

import java.util.Arrays;

public class InsertingValuesInArrayPgm {

	public static void main(String[] args)
	{
		//int a[]=new int[3];array indexoutofbound exception
		int a[]=new int[5];
		a[0]=45;
		a[1]=56;
		a[2]=43;
		a[3]=78;
		//for (int i=0;i<=4;i++) array indexoutofbond exception
		System.out.println(Arrays.toString(a));
		String s[]=new String[4];
		s[0]="Sowmya";
		s[1]="Rahul";
		s[2]="Abhirath";
		s[3]="Abhi";
		//for(int i=0;i<=3;i++)
			//System.out.println(s[i]);
		System.out.println(Arrays.toString(s));
		char c[]=new char[2];
		c[0]='m';
		c[1]='f';
		System.out.println(Arrays.toString(c));
		
		
		
	}

}
