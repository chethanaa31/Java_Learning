package day_11;

public class Overloading_MainMethod {
	
	void main(int x) {
		System.out.println(x);
	 	
	}
	
	void main(String s) {
		System.out.println(s);
	 	
	}
	
	void main(String s1, String s2) {
		System.out.println(s1+s2);
	 	
	}

	public static void main(String[] args) {
		Overloading_MainMethod ov=new Overloading_MainMethod();
		ov.main(100);
		ov.main("John");
		ov.main("Sita ","Ram");

	}

}
