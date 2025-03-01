//Storing Data in variables
package day_10;

public class Student_Main {

	public static void main(String[] args) {
	
		//Student st=new Student();
		
		// 1. Using Object reference variables
		/* st.sid=101;
		st.name="Hanuman";
		st.grad='A';
		st.printStudentData(); */
		
		//  2. Using method
		//st.setStudentData(100, "Ram", 'A');
		//st.printStudentData();
		
		// 3. Using Constructor
		Student stu=new Student(101,"John",'A');
		stu.printStudentData();
		
		

	}

}
