package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapIteratorWhileLoop {

	public static void main(String[] args) 
	{
		Map<String,Integer> m=new HashMap<String,Integer>();
		m.put("Sowmya", 90000);
		m.put("Abhirath", 110000);
		m.put("Rahul",99000);
		m.put("Sai", 99000);
		System.out.println(m);
		Map<String,Integer> m1=new HashMap<String,Integer>();
		m.put("Prashant",980000);
		m1.putAll(m);
		System.out.println(m1);
		boolean b=m.isEmpty();
		System.out.println(b);
		System.out.println(m1.keySet());
Iterator <Entry <String, Integer>> i =m.entrySet().iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}
	}

}
