package Programs;

import java.util.Scanner;

public class NestedifCondn1 {

	public static void main(String[] args)
	{
		int fare=50;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age of the person");
		int age=s.nextInt();
		System.out.println("Enter the gender of the person Male=1,Female=2");
		int gender=s.nextInt();
		if(age>=12 && age<=55)
			if(gender==1)
				System.out.println("Your fare is "+fare);
			else
				System.out.println("No fare, its free");
		else if(age<=12 && gender==2)
			System.out.println("No fare");
		else
			System.out.println("Half Fare");
		
			
			

	}

}
