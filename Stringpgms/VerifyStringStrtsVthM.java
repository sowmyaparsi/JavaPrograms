package Stringpgms;

public class VerifyStringStrtsVthM {

	static boolean b1;
	public static void main(String[] args) 
	{
		String s="My name is Ram";
		//boolean b1=false;
		b1=s.matches("M(.*)");
		if(b1==true)
		System.out.println("String starts with M " +b1);
		else
		System.out.println("String doesnt starts with M" +b1);
	}

}
