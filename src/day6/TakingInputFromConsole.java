package day6;

import java.util.Scanner;

public class TakingInputFromConsole {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		/*
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		System.out.println(num);
		*/
		
		/*
		System.out.println("Enter a decimal number: ");
		double num=sc.nextDouble();
		System.out.println(num);
		*/
		
		System.out.println("Enter a city: ");
		String city=sc.next();
		System.out.println(city);
	}

}
