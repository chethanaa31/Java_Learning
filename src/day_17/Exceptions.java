/*
---> Exception - An event which will cause program termination.
			1) Checked exceptions - exceptions identified by java compiler.
				Ex: InterruptedException, FileNotFound, IOException etc..
			
			2) Un-checked Exceptions - Not identified by java compiler.
				 Ex: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc..

---> Errors:
		* syntax - when java syntax is not followed
		* logical - when the output is not the expected value.
 */



package day_17;

import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		
		System.out.println("Program is started..");
		
		//Example 1
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter a number: ");
		int num=sc.nextInt(); //if num=0, Arithmatic exception
		System.out.println(100/num); */
		
		//Example 2
		/*int a[]=new int[5];
		System.out.println("Enter position(0-4): "); //if pos=5, ArrayIndexOutOfBoundsException
		int pos=sc.nextInt();
		
		System.out.println("Enter a value: ");
		int value=sc.nextInt();
		
		a[pos]=value;
		System.out.println(a[pos]); */
		
		//Example 3
		/*String s="welcome"; //NumberFormatException
		int num=Integer.parseInt(s);
		System.out.println(num); */
		
		//Example 4
		String s=null; //NullPointerException
		System.out.println(s.length());
		
		
		System.out.println("Program completed..");

	}

}
