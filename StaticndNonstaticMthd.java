package Programs;

public class StaticndNonstaticMthd

{
   int a=10;
   static int b=20;
   static void add()
   {
	   StaticndNonstaticMthd lc=new StaticndNonstaticMthd();
	   int c=lc.a+b;
	   System.out.println(c);
   }
   void sub()
   {
	   int c=b-a;
	   System.out.println(c);
   }
   
	public static void main(String[] args)
	{
		StaticndNonstaticMthd lc1=new StaticndNonstaticMthd();
	    //lc1.mul();
		add();
		lc1.sub();
	int c=lc1.a*b;
	System.out.println(c);
		
	}

}
