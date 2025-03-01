package day6;

import java.util.Arrays;

public class Sorting_String {

	public static void main(String[] args) {
		//String s[]= {"A","D","H","C"};
		String s[]= {"Hello", "World", "Alex"};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(s));
		
		Arrays.sort(s);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(s));

	}

}
