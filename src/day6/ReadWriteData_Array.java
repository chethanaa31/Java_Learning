package day6;

import java.util.Arrays;
import java.util.Scanner;

public class ReadWriteData_Array {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter value for the position" +i+ ": ");
			a[i]=sc.nextInt();
		}
		System.out.println("Printing array elements: ");
		System.out.println(Arrays.toString(a));
		

	}

}
