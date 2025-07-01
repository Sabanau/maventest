package collections;

import java.util.ArrayList;
import java.util.List;

//import java.util.HashSet;

//import java.util.ArrayList;

public class NonGeneric {

	public static void main(String[] args) {
		//  data type not defined
		//ArrayList a = new ArrayList(); // ordered
		//HashSet a = new HashSet();// shuffeled, no duplicates
		List  a = new ArrayList ();
		a.add(123);
		a.add("Hello");
		a.add("Hello");
		a.add('s');
		System.out.println(a);
	}

}
