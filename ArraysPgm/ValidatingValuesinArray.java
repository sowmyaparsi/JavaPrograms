package ArraysPgm;

public class ValidatingValuesinArray {

	public static void main(String[] args) 
	{
		int a[]=new int[4];
		a[0]=34;
		a[1]=50;
		a[2]=45;
		a[3]=67;
		for(int i=0;i<4;i++)
			if(a[i]==50)
				System.out.println("50 is present in array");
	}

}
