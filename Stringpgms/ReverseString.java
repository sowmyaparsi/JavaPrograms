package Stringpgms;

public class ReverseString {

	public static void main(String[] args) 
	{
		String s="sowmya",s1="";
		char a;
		int i;
		for(i=s.length()-1;i>=0;i--)
		{
			a=s.charAt(i);
			s1=s1+a;
		}
		System.out.println("The reverse of String   " +s1);
		
	}

}
