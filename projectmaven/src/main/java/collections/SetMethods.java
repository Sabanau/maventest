package collections;

import java.util.*;

public class SetMethods {

	public static void main(String[] args) {
		Set <String> colour = new TreeSet <String> ();
		Set <String> fruit = new TreeSet <String> ();
		
		colour.add("black");
		colour.add("orange");
		colour.add("red");
		
		fruit.add("apple");
		fruit.add("melon");
		fruit.add("lemon");
		
		System.out.println(colour);
		System.out.println(fruit);
		
		//method1: addAll()
		colour.addAll(fruit);
		System.out.println(colour); // not order
		
		//method2: remove()
		colour.remove("red");
		System.out.println(colour);
		
		//method3: removeAll()
		colour.removeAll(fruit);
		System.out.println(colour);
		
		//method4: clear()
		colour.clear();
		System.out.println(colour);
		
		//get and last indexof
	
		

	}

}
