package Programs;

public class MathNdThreadClass {

	public static void main(String[] args) throws InterruptedException 
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Math.random());
			Thread.sleep(3000);
		}
	}

}
