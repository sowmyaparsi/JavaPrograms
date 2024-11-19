package Stringpgms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		String s,s1="";
		char a;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one String");
		s=sc.next();
		for(i=s.length()-1;i>=0;i--)
		{
			a=s.charAt(i);
			s1=s1+a;
		}
		System.out.println("The reverse of String   " +s1);
		if(s.equals(s1))
			System.out.println("The given String is Palindrome");
		else
			System.out.println("The given String is not Palindrome");
	}

}
