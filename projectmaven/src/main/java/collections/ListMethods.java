package collections;

import java.util.*;

public class ListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = new ArrayList<String> ();
		//method1 : add()
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("grapes");
		fruits.add("lemon");
		System.out.println(fruits);
		
		//method2 : get()
		System.out.println(fruits.get(1));
		
		//method3 : set()
		fruits.set(2, "melon");
		System.out.println(fruits);
		
		//method4 : indexof()		
		fruits.add("apple");
		System.out.println(fruits);
		System.out.println(fruits.indexOf("apple"));
		
		//method5 : lastIndexof()
		System.out.println(fruits.lastIndexOf("apple"));
		
		//method6 : remove()
		fruits.remove("apple");
		System.out.println(fruits);
		
		//method7 : contains()
		System.out.println(fruits.contains("orange"));
		
		//method8 : isEmpty()
		System.out.println(fruits.isEmpty());
		
		//method9 : isEmpty()
		System.out.println(fruits.isEmpty());
		
		//method10 : size()
		System.out.println(fruits.size());
		
		

	}

}
