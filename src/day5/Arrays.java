/*
 * Arrays - Collection of elements of same data type (Homogeneous data). We can store multiple values into single variable.
 * Types of array - 1D and 2D.
 */



package day5;

public class Arrays {

	public static void main(String[] args) {
		
		/*
		 --> Single Dimensional Array
		 		* Declare an array
		 		* Add value to an array
		 		* Find length of an array
		 		* Read single value from an array.
		 		* Read multiple values from an array.
		 */

		//Declare and add value to an array.
		//Approach 1
	/*	int a[]=new int[5];
		a[0]=100;
		a[1]=100;
		a[2]=100;
		a[3]=100;
		a[4]=100; */
		
		//Approach 2
		int a[]= {100, 200,300,400,500};
		
		//find length
		System.out.println("Length of an array: "+a.length);
		
		//Reading single value
		System.out.println(a[4]);
		
		//Reading multiple value
		
		//For loop
		for(int i=0; i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		
		//Enhanced for loop / for each loop
		for(int x:a) {
			System.out.println(x);
		}
		
		
		/*
		 --> Two Dimensional Array
		 		* Declare an array
		 		* Add value to an array
		 		* Find length of an array
		 		* Read single value from an array.
		 		* Read multiple values from an array.
		 */
		
		//Approach 1
		/*int y[][]=new int[3][2];
		y[0][0]=100;
		y[0][1]=100;
		y[1][0]=100;
		y[1][1]=100;
		y[2][0]=100;
		y[2][1]=100; */
		
		//Approach 2
		int y[][]= {{100,200}, {300,400}, {500,600}};
		System.out.println("Row length: "+y.length);
		System.out.println("Column length: "+ y[0].length);
		//Read single value
		System.out.println(y[2][1]);
		
		//Read all the values
		//For loop
		for(int j=0;j<y.length;j++) {
			for(int k=0;k<y[j].length;k++) {
				System.out.println(y[j][k]);
			}
		}
		
		//enhanced for loop
		for(int arr[]:y) {
			for(int n:arr) {
				System.out.println(n);
			}
		}
	}

}
