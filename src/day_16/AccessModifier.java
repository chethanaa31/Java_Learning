/*
---> Access Modifiers - defines scope of variables and methods.
		* public - Can access everywhere.
		* protected - can access outside of package through inheritance.
		* default - no specification of default required. Can access in the package only.
		* private - can access variables in the class only.
 */



package day_16;

public class AccessModifier {

	private int x=100;
	
	private void m1() {
		System.out.println("This is m1..");
	}

	public static void main(String [] args) {
		AccessModifier m=new AccessModifier();
		m.m1();
	}
}
