package day_18;

public class TypecastingObjects2 {

	public static void main(String[] args) {
		//Ex1
		//Object o=new String("welcome");
		//StringBuffer sb=(StringBuffer) o; //Rule 1 - yes; Rule2-yes; Rule3-no
		
		//Ex2
		//String s=new String("welcome");
		//StringBuffer sb=(StringBuffer) s; //Rule1-no
		
		//Ex3
		//Object o =new String("welcome");
		//StringBuffer sb=(StringBuffer) o; //Rule1-yes; Rule2-yes; Rule3-no
		
		//Ex4
		//Object o=new String("welcome");
		//StringBuffer sb=(String) o; //Rule1-yes; Rule2-no; Rule3-yes
		
		//Ex5
		//String s=new String("welcome");
		//StringBuffer sb=(String) s; //Rule1-yes; Rule2-no; Rule3-yes
		
		//Ex6
		//Object o=new String("welcome");
		//StringBuffer sb=(StringBuffer) o; //Rule1-yes; Rule2-yes; Rule3-no
		
		//Ex7
		Object o=new String("welcome");
		String sb=(String) o; //Rule1-yes; Rule2-yes; Rule3-yes
		System.out.println(sb);
	}

}
