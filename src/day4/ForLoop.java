package day4;

public class ForLoop {

	public static void main(String[] args) {
		
		//print 1 to 10
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}

		//print even numbers from 1 to 10
		for(int a=2;a<=10;a+=2) {
			System.out.println(a);
		}
		
		//print even or odd number
		for(int b=1;b<=10;b++) {
			if(b%2==0) {
				System.out.println(b+" Even");
			}
			else {
				System.out.println(b+" Odd");
			}
		}
		
		//print 10 to 1
		for(int d=10;d>=1;d--) {
			System.out.println(d);
		}
	}

}
