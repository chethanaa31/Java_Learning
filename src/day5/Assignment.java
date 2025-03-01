package day5;

public class Assignment {

	public static void main(String[] args) {
		/*
		 * Find the sum of elements in array
		 * Print even and odd numbers from array.
		 * Find prime number
		 */

		//find sum of elements
		int a[]= {100,200,300};
		int sum=0;
		for(int x:a) {
			sum+=x;
			
		}
		System.out.println("Sum is: "+ sum);
		
		//print even and odd numbers from array.
		int b[]= {200,300,7};
		for(int y:b) {
			if(y%2==0) {
				System.out.println(y + " Even");
			}
			else {
				System.out.println(y + " Odd");
			}
			
		}
		
		//Find prime number
	}

}
