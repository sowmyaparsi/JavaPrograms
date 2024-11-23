package encapsulation;
class Amazon
{
	private String emailid="psowmya77@gmail.com";
	public String getemailid()
	{
		return emailid;
	}
	public void setemailid(String email)
	{
		this.emailid=email;
	}
}

public class SetterGetterMethods  {

	public static void main(String[] args) 
	{
		Amazon a=new Amazon();
		
		a.setemailid("abc@gmail.com");
		String b=a.getemailid();
		System.out.println(b);
	}

}
