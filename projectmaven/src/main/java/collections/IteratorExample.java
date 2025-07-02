package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class IteratorExample {

	public static void main(String[] args) {
		Set <String> colour = new TreeSet <String> ();
		
		colour.add("black");
		colour.add("orange");
		colour.add("red");
		
		System.out.println(colour);
		
		 Iterator<String> i = colour.iterator();
		 while(i.hasNext()) {
			 System.out.println(i.next());				
		 }
		 i.remove(); // last index element remove
		 System.out.println(colour);
	}

}
