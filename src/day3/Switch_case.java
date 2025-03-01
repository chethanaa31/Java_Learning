package day3;

public class Switch_case {

	public static void main(String[] args) {
		
		int a=0;
		
		switch(a) {
		
		case 0: System.out.println("Sunday"); break;
		case 1: System.out.println("Monday");break;
		case 2: System.out.println("Tuesday");break;
		case 3: System.out.println("Wednesday");break;
		case 4: System.out.println("Thursday");break;
		case 5: System.out.println("Friday");break;
		case 6: System.out.println("Saturday");break;
		default: System.out.println("Invalid number");
		
		}
		
		//using ternary operator
		int b=100, c=200;
		int d=(b>c)? b: c;
		System.out.println(d);

	}

}
