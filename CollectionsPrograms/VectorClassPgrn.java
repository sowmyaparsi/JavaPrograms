package CollectionsPrograms;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Vector;

public class VectorClassPgrn 
{
	public static void main(String[] args) 
	{
		Vector vc=new Vector();
		vc.add(12);
		vc.add(1);
		vc.add(1009);
		//vc.add(5.9);
	    //vc.add("sowmya");
		//vc.add('c');
		//vc.add(null);
		vc.add(12);
		vc.add(3,43);
		
		System.out.println("Before Sorted" +vc);
		vc.sort(null);
		System.out.println("Sorted" +vc);
		ListIterator li=vc.listIterator();
		System.out.println("Forward");
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("backward");

		while(li.hasPrevious())
		{
			System.out.println(li.previous());

		}
		
	}

}
