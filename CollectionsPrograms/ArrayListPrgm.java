package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayListPrgm {

	public static void main(String[] args) 
	{
		ArrayList ar=new ArrayList();
		ar.add(12);
		ar.add(1);
		ar.add(1009);
		//ar.add(5.9);
	//	ar.add("sowmya");
	//	ar.add('c');
		//ar.add(null);
		ar.add(12);
		ar.add(3,43);
		//ar.
		System.out.println("Before Sorted" +ar);
		ar.sort(null);
		System.out.println("Sorted" +ar);
		ListIterator li=ar.listIterator();
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
