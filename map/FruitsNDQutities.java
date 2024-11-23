package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class FruitsNDQutities {

	public static void main(String[] args) 
	{
		Map<String,Integer> m=new HashMap<String,Integer>();
		m.put("Apple", 200);
		m.put("Oranges", 150);
		m.put("banana",120 );
		m.put("Grapes", 200);
		m.put("strawberries", 300);
		System.out.println(m);
		for(Integer i: m.values())
			System.out.println(i);
		m.remove("banana");
		System.out.println(m);
		Iterator <Entry <String, Integer>> i=m.entrySet().iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		
		
	}

}
