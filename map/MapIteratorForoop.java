package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapIteratorForoop {

	public static void main(String[] args) 
	{
		Map<String,Integer> m=new HashMap<String,Integer>();
		m.put("Sowmya", 90000);
		m.put("Abhirath", 110000);
		m.put("sai",99000);
		m.put("Sai", 99000);
		System.out.println(m);
		Map<String,Integer> m1=new HashMap<String,Integer>();
		m.put("Prashant",980000);
		m1.putAll(m);
		System.out.println(m1);
		boolean b=m.isEmpty();
		System.out.println(b);
		System.out.println(m1.keySet());
		for(String s1:m1.keySet())
			System.out.println(s1);
		System.out.println("-------");
		for(Integer s2:m1.values())
			System.out.println(s2);
		for (Entry<String, Integer> s3 :m1.entrySet())
			System.out.println(s3);
		
	}

}
