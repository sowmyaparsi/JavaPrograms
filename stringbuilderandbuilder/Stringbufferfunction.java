package stringbuilderandbuilder;

public class Stringbufferfunction {
	public static void main(String[] args) 
	{
		String a="Automation";
		String s=new String();
		a.concat("testing");
		System.out.println(a);
		StringBuffer str =new StringBuffer("Sowmya");
		str.append("Sowmya");
		System.out.println(str);
		System.out.println(str.reverse());
	}
}
