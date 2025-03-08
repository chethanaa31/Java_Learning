/*
---> HashMap - a class implemented Map Interface.
		* Data can be stored in the form of key, value pairs.
		* Key is unique, but we can have duplicate values.
		* Insertion order not preserved (Index not followed)
 */


package day_19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Declaration
		//HashMap hm=new HashMap();
		//Map hm=new HashMap();
		HashMap <Integer,String>hm=new HashMap<Integer,String>();
		
		//Adding pairs
		hm.put(101, "John");
		hm.put(102, "David");
		hm.put(103, "Rachel");
		hm.put(104, "Joey");
		hm.put(102, "Chandler"); //duplicated key record will not be printed.
		System.out.println(hm);//{101=John, 102=Chandler, 103=Rachel, 104=Joey}
		
		//Size of HashMap
		System.out.println(hm.size());//4
		
		//remove pair
		hm.remove(103); //103 is the key of the pair
		System.out.println(hm); //{101=John, 102=Chandler, 104=Joey}
		
		//access value of the key
		System.out.println(hm.get(102)); //Chandler
		
		//get all the keys of HashMap
		System.out.println(hm.keySet()); //[101, 102, 104]
		System.out.println(hm.values()); //[John, Chandler, Joey]
		System.out.println(hm.entrySet()); //[101=John, 102=Chandler, 104=Joey]
		
		//Reading data from hashmap
		
		//Using enhanced for loop
		for(int k:hm.keySet()) {
			System.out.println(k+"   "+hm.get(k));
		}
		
		//Using Iterator
		Iterator<Entry<Integer,String>> it=hm.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer,String> entry =it.next();
			System.out.println(entry.getKey()+"    "+entry.getValue());
		}
		
		//clear data
		hm.clear();
		System.out.println(hm.isEmpty()); //true
		
		

	}

}
