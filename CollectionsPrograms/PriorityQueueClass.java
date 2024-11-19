package CollectionsPrograms;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;
public class PriorityQueueClass {

	public static void main(String[] args) 
	{
		PriorityQueue pq=new PriorityQueue();
		pq.add(12);
		pq.add(1);
		pq.add(1009);
		//pq.add(5.9);
	   // pq.add("sowmya");
	   // pq.add('c');
		//pq.add(null);
		pq.add(12);
		System.out.println("Before Sorted" +pq);
		//vc.sort(null);
		//System.out.println("Sorted" +pq);
		Iterator li=pq.iterator();
		System.out.println("Forward");
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
	}

}
