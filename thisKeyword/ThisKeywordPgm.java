package thisKeyword;
class SuperPrint{
	 String fname="sony",lname;
	 int age;
	void display(String fname,String lname,int age)
	{
		this.fname=fname;
		this.lname=lname;
		this.age=age;
		}
	void print() {
		System.out.println("The first name is "+this.fname);
		System.out.println("The last name is "+lname);
		System.out.println("The age is "+age);
	}
}

public class ThisKeywordPgm extends SuperPrint {

	public static void main(String[] args) 
	{
		ThisKeywordPgm tp=new ThisKeywordPgm();
		tp.display("sowmya","parsi",25);
		tp.print();
		
	}

}
