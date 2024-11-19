package Stringpgms;

import java.util.Arrays;

public class CountingAlphaMString {

	public static void main(String[] args) 
	{
		int a=0;
		String s="Kv no 2";
		char c[]=s.toCharArray();
		System.out.println(Arrays.toString(c));
		for(int i=0;i<s.length();i++)
		{
			if(Character.isAlphabetic(c[i])==true)
			a=a+1;
		}
		System.out.println(a);
	}

}
