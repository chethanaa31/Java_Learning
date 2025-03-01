package day5;

public class ObjectArray {

	public static void main(String[] args) {
		// Storing heterogeneous data
		Object a[]= {10,"hello",'a',500,true};
		for(Object x:a) {
			System.out.println(x);
		}
		
		//Normal For loop
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
