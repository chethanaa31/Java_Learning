/* --> Types of constructors:
 		* Default
 		* Parameterized
 
 */

package day_10;

public class ConstructorDemo {
	int x,y;
	
	ConstructorDemo() //Default Constructor
	{
		x=100;
		y=200;
	}
	
	ConstructorDemo(int a, int b) //Parameterized Constructor
	{
		x=a;
		y=b;
	}
	
	void sum() {
		System.out.println(x+y);
	}
	

	public static void main(String[] args) {
		
		ConstructorDemo cd=new ConstructorDemo(200,800);
		cd.sum();
		

	}

}
