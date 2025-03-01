package day3;

public class Nested_If_else {

	public static void main(String[] args) {
		
		if(true) {
			if(true) {
				System.out.println("abc");
			}
			else {
				System.out.println("xyz");
			}
		}
		
		else {
			System.out.println("123");
		}
		
		
		int day=0;
		if(day==0) {
			System.out.println("Sunday");
		}
		else if(day==1) {
			System.out.println("Monday");
		}
		else if(day==2) {
			System.out.println("Tuesday");
		}
		else if(day==3) {
			System.out.println("Wednesday");
		}
		else if(day==4) {
			System.out.println("Thursday");
		}
		else if(day==5) {
			System.out.println("Friday");
		}
		else if(day==6) {
			System.out.println("Saturday");
		}
		else {
			System.out.println("Invalid number");
		}

	}

}
