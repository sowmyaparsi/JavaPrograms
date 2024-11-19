package ArraysPgm;

import java.util.Arrays;

public class NullValueInArrayPgm {

	public static void main(String[] args) 
	{
		String a[]=new String[4];
		a[0]="sowmya";
		a[1]="parsi";
		a[2]=null;
		a[3]="abhirath";
		System.out.println(Arrays.toString(a));
		Integer b[]=new Integer[3];
		b[0]=45;
		b[1]=null;
		b[2]=65;
		System.out.println(Arrays.toString(b));
		int c[]=new int[3];
		c[0]=12;
		c[1]=56;
		c[1]=null;
		c[2]=56;
		System.out.println(Arrays.toString(c));
		}

}
