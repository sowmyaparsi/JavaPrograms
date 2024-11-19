package CollectionsPrograms;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListClassPgm {

	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		ll.add(12);
		ll.add(1);
		ll.add(1009);
		ll.add(5.9);
	    ll.add("sowmya");
		ll.add('c');
		ll.add(null);
		ll.add(12);
		ll.add(3,43);
		System.out.println("Before Sorted" +ll);
		//ll.sort(null);
		//System.out.println("Sorted" +ll);
		ListIterator li=ll.listIterator();
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
