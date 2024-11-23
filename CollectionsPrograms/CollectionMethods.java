package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

public class CollectionMethods {

	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(45);
		c1.add(34);
		c1.add(23);
		c1.add(25);
		System.out.println(c1);
		Collection<Integer> c2=new ArrayList<Integer>();
		c2.addAll(c1);
		System.out.println(c2);
		c2.add(1);
		System.out.println(c2);
		boolean b=c1.contains(33);
		System.out.println(b);
		boolean b1=c2.containsAll(c1);
		System.out.println(b1);
		boolean b2=	c1.isEmpty();
		System.out.println(b2);
		c1.remove(45);
		System.out.println(c1);
		System.out.println(c2);
		c2.removeAll(c1);
		System.out.println(c2);
		
		
}

}
