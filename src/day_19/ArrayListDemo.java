/*
---> Array List - class which is implemented in List Interface.

		* Heterogenous data - allowed
		* Insertion order - preserved (index)
		* Duplicate elements - allowed
		* multiple nulls - allowed
 */


package day_19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Declaration
		ArrayList mylist=new ArrayList();
		//List myList=new ArrayList();
		
		//Storing homogeneous data
		//ArrayList <String>mylist=new ArrayList<String>();
		
		//Adding data ton array list
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome!");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		//Size of arrayList
		System.out.println(mylist.size());
		
		//Printing arrayList
		System.out.println(mylist);
		
		//Remove element from arrayList
		mylist.remove(5);
		System.out.println(mylist);
		
		//Insert element in arrayList
		mylist.add(2,"java");
		System.out.println("After Insertion: "+ mylist);
		
		//Modifying element
		mylist.set(2, "python");
		System.out.println("After Replacing: " + mylist);
		
		//Access specific element 
		System.out.println(mylist.get(3));
		
		//Reading all the elements from arrayList
		
		//Using for loop
		for(int i=0;i<mylist.size();i++) {
			System.out.println(mylist.get(i));
		}
		
		//using enhanced for loop
		for(Object x:mylist) {
			System.out.println(x);
		}
		
		//Using iterator
		Iterator it=mylist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Checking arrayList is empty or not
		System.out.println("Is arrayList empty? "+ mylist.isEmpty());
		
		//Remove specific elements from array list
		ArrayList mylist2=new ArrayList();
		mylist2.add(100);
		mylist2.add("welcome!");
		
		
		mylist.removeAll(mylist2);
		System.out.println("After removing: "+ mylist);
		
		//Remove all the elements
		mylist.clear();
		System.out.println(mylist.isEmpty());
		
		
		

	}

}
