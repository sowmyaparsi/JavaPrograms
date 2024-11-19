package CollectionsPrograms;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
public class HashSetPgrm {
	public static void main(String args[])
	{
		HashSet hs=new HashSet();
		hs.add(56);
		hs.add(120);
		hs.add(17);
		hs.add(34354);
		hs.add(5.9);
	    hs.add("Sowmya");
		hs.add('c');
		hs.add(null);
		hs.add(120);
		System.out.println("Before Sorted" +hs);
		//Collections.sort(hs);
		Iterator li=hs.iterator();
		System.out.println("Forward");
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		/*System.out.println("backward");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());

		}*/
		
	}
}

