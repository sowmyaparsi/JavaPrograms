package Stringpgms;

public class StringContainsPgms {

	public static void main(String[] args) 
	{
		String s1="sowmya parsi chintakunta";
		String s3=s1.toLowerCase();
		System.out.println(s3);
		boolean b=s1.contains("parsi");
		if(b==true)
			System.out.println("String contains substring");
		else
			System.out.println("String doesnot contains substring");
		boolean s2="Sowmya".equals("sowmya");
		System.out.println(s2);

	}

}
