package day_17;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {
		
		System.out.println("Program is started..");
		
		//Example 1
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt(); //if num=0, Arithmatic exception
		
		try {
		System.out.println(100/num);
		}
		
		catch(ArithmeticException e) {
			System.out.println("Invalid data..");
		}
		
		System.out.println("Program completed...");

	}

}
