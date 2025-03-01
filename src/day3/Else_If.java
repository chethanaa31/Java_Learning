package day3;

public class Else_If {

	public static void main(String[] args) {
		
		int num=0;
		
		if(num>0) {
			System.out.println("Positive");
		}
		
		else if(num<0) {
			System.out.println("Negative");
		}
		
		else {
			System.out.println("Zero");
		}
		
		//Largest of 3 numbers
		int a=100, b=780, c=900;
		
		if(a>b && a>c) {
			System.out.println("a is largest number.");
			
		}
		
		else if(b>a && b>c) {
			System.out.println("b is largest number.");
		}
		
		else {
			System.out.println("c is the largest number.");
		}

	}

}
