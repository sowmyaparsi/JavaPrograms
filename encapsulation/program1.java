package encapsulation;
class fllipkart
{
private	String pwd="asdf";
public void setpwd(String pwd)
{
	this.pwd=pwd;
}
public String getpwd()
{
	return pwd;
}
	
}

public class program1 {

	public static void main(String[] args) 
	{
		
		fllipkart a=new fllipkart();
		a.setpwd("sowmya");
		System.out.println(a.getpwd());
	}

}
