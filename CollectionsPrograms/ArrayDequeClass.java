package CollectionsPrograms;
import java.util.ArrayDeque;
import java.util.Iterator;
public class ArrayDequeClass {
	public static void main(String[] args) 
	{
		ArrayDeque ad=new ArrayDeque();
		ad.add(12);
		ad.add(1);
		ad.add(1009);
		//pq.add(5.9);
	   // pq.add("sowmya");
	   // pq.add('c');
		//pq.add(null);
		ad.add(12);
		System.out.println("Before Sorted" +ad);
		//vc.sort(null);
		//System.out.println("Sorted" +pq);
		Iterator li=ad.iterator();
		System.out.println("Forward");
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
	}

}
