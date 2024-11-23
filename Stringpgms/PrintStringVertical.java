package Stringpgms;

import java.util.Arrays;

public class PrintStringVertical {

	public static void main(String[] args) 
	{
		String s="SOWMYA";
		char c[]=s.toCharArray();
		System.out.println(Arrays.toString(c));
		for(int i=0;i<s.length();i++)
		{
			char c1=s.charAt(i);
			System.out.println(c1);
			
		}
			
			//System.out.println(c[i]);
		System.out.println("----------");
		for(int i=s.length()-1;i>=0;i--)
		System.out.println(c[i]);
	}

}
