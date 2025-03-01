package day4;

public class WhileLoop {

	public static void main(String[] args) {
		
		//print 1 to 10 numbers.
	/*	int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
*/
		
		//print Hello message 10 times
	/*	int i=1;
		while(i<=10) {
			System.out.println("Hello");
			i++;
		} */
		
		//print even numbers from 1 to 10
	/*	int i=2;
		while(i<=10) {
			System.out.println(i);
			i+=2;
		} */
		
		//Approach 2
	/*	int a=1;
		while(a<=10) {
			if(a%2==0) {
			System.out.println(a);
			}
			a++;
		} */
		
		//print even and odd number
	/*	int a=1;
		while(a<=10) {
			if(a%2==0) {
			System.out.println(a + " Even");
			}
			else {
				System.out.println(a + " Odd");
			}
			a++;
		} */
		
		//print 10 to 1
		int a=10;
		while(a>=1) {
			System.out.println(a);
			a--;
		
		}
		
		//While loop without condition
		
		int i=1;
		while(true) {
			System.out.println(i);
			i++;
			
			if(i==10) {
				break;
			}
		}
	}

}
