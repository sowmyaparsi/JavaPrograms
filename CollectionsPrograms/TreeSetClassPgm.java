package CollectionsPrograms;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetClassPgm 
{
	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		//ts.add(60);
		//ts.add(1);
		//ts.add(170);
		//ts.add(35);
		//ts.add(5.9);
	    ts.add("Sowmya");
	    ts.add("sripurvika");
	    ts.add("Abhirath");
		//ts.add('j');
		//ts.add(null);
		//ts.add(170);
		System.out.println("Before Sorted" +ts);
		//Collections.sort(hs);
		Iterator li=ts.iterator();
		System.out.println("Forward");
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
	}

}
