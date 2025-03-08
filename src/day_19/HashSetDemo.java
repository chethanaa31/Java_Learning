/*
---> Hash Set - class which is implemented by Set Interface.

		* Heterogenous data - allowed
		* Insertion order - Not preserved (index not supported)
		* Duplicate elements - Not allowed
		* multiple nulls - Not allowed / only single null is allowed
 */

package day_19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//Declaration
		HashSet myset=new HashSet();
		//Set myset=new HashSet();
		//HashSet <String>myset=new HashSet<String>();
		
		//adding elements in hashset
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome!");
		myset.add('A');
		myset.add(true);
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		//Printing Hashset - No duplication
		System.out.println(myset); //[null, A, 100, 10.5, welcome!, true]
		
		//Removing element
		myset.remove(10.5); //10.5 is value
		System.out.println("After removal: "+ myset);

		//Inserting element - Not possible
		
		//Access specific element - Not possible
		
		//Convert HashSet --> ArrayList
		ArrayList al=new ArrayList(myset);
		System.out.println(al);
		System.out.println(al.get(2));
		
		//Size of hashSet
		System.out.println(myset.size());
		
		//read all the elements using enhanced for loop
		for(Object x:myset) {
			System.out.println(x);
		}
		
		//using iterator
		Iterator it=myset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//clearing all the elements in hashSet
		myset.clear();
		System.out.println(myset.isEmpty()); //true
		

		
		

		
	}

}
