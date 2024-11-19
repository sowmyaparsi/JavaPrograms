package Stringpgms;

public class VerifyStringEndVthY {

	public static void main(String[] args) 
	{
		String s="I'm a boy";
		boolean b=s.matches("(.*)y");
		if(b==true)
			System.out.println("String end with y  " +b);
		else
			System.out.println("String doesnt end with y" +b);
				
	}

}
