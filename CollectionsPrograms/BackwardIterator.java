package CollectionsPrograms;

import java.util.ArrayList;
import java.util.ListIterator;

public class BackwardIterator {
		public static void main(String[] args) {
	       
	        ArrayList<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        ListIterator<String> iterator = list.listIterator();
	        System.out.println("Backward iteration:");
	        try {
	            while (iterator.hasPrevious()) {
	                System.out.println(iterator.previous());
	            }
	        } catch (Exception e) {
	            System.out.println("Error: " + e);
	        }
	    }

}
