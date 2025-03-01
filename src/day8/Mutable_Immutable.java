package day8;

import java.util.Arrays;

public class Mutable_Immutable {

	public static void main(String[] args) {
		int a[]= {20,80,60,54};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a); //mutable
		System.out.println(Arrays.toString(a));
		
		//immutable
		String s=new String("welcome");
		System.out.println(s); //welcome
		String concatstrings=s.concat(" to java"); //storing to another variable
		System.out.println(s); //welcome --> immutable - cannot change
		System.out.println(concatstrings); //welcome to java
		
		
		

	}

}
