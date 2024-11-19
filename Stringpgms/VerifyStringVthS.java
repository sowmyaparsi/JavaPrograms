package Stringpgms;

public class VerifyStringVthS {

	public static void main(String[] args) 
	{
		String s="I'm a simple boy";
		boolean b1=s.matches("(.*)s(.*)");
		if(b1==true)
			System.out.println("String have s character in string");
		else
			System.out.println("String doesnt have s character in string");
	}

}
