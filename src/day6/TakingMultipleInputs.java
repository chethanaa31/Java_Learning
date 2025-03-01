package day6;

import java.util.Scanner;

public class TakingMultipleInputs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1=sc.nextInt();
		System.out.println("Enter num2: ");
		int num2=sc.nextInt();
		
		System.out.println("Sum is: "+(num1+num2));
		
		System.out.println("Enter unknown value: ");
		Object value=sc.next();
		System.out.println(value);
	}

}
