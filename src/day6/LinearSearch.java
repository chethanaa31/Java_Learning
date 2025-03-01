package day6;

public class LinearSearch {

	public static void main(String[] args) {
		
		int a[]= {200,400,800,5,8,9};
		int search=200;
		boolean status=false;
		
		for(int x:a) {
			if(x==search) {
				System.out.println("Element found!");
				status=true;
				break;
			}
			
		}
		if(status==false) {
		System.out.println("Element not found");
		}
	}

}
