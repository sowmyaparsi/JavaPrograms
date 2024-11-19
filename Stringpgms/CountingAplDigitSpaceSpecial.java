package Stringpgms;

import java.util.Arrays;

public class CountingAplDigitSpaceSpecial 
{
	static int countofalphabets,countofnum,countofspace,countofsymbol;
	public static void main(String[] args)
	{
		String s="kv no 2 bangalore";
		boolean b1,b2,b3;
		char c[]=s.toCharArray();
		System.out.println(Arrays.toString(c));
		for(int i=0;i<s.length();i++)
		{
		b1=Character.isAlphabetic(c[i]);
		if(b1==true)
			countofalphabets++;
		}
		System.out.println("The number of character" +countofalphabets);
		for(int i=0;i<s.length();i++)
		{
		b2=Character.isDigit(c[i]);
		if(b2==true)
			countofnum++;
		}
		System.out.println("The number of character" +countofnum);

		for(int i=0;i<s.length();i++)
		{
		b3=Character.isWhitespace(c[i]);
		if(b3==true)
			countofspace++;
		}
		System.out.println("The number of spaces" +countofspace);
		countofsymbol=s.length()-(countofalphabets+countofnum+countofspace);
		System.out.println("The number of symbols " +countofsymbol);

	}
	

}
