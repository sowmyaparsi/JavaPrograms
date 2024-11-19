package CollectionsPrograms;
import java.util.ListIterator;
import java.util.Stack;
public class StackClasspgrm {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.add(5);
		s.add(10);
		s.add(3960);
		//s.add(8.3);
	    //s.add("parsi");
		//s.add('b');
		//s.add(null);
		s.add(10);
		s.add(3,23);
		System.out.println("Before Sorted" +s);
		s.sort(null);
		System.out.println("Sorted" +s);
		ListIterator li=s.listIterator();
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


