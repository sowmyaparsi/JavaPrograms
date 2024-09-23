package Programs;

public class LogicalOperatorifCondn {

	public static void main(String[] args) 
	{
		int a=50,b=34,c=5;
		if(a<b && a<c)
			System.out.println("a is smaller");
		else if(b<c && b<a)
			System.out.println("b is smaller");
		else
			System.out.println("c is smaller");
	}

}
