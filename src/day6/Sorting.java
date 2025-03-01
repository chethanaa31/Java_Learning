package day6;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int a[]= {8,65,900,57,200};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(a));
	}

}
