package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Generic {

	public static void main(String[] args) {
		// ArrayList <String> s = new ArrayList<String> ();
		HashSet <String> s = new HashSet <String> ();
		HashSet <Integer> s1 = new HashSet <Integer> ();
		 s.add("Helo");
		 s.add("yes");
		 s.add("yes");
		 s1.add(123);
		 System.out.println(s);
		 System.out.println(s1);
	}

}
