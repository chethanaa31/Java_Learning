/*
 --> Method:
 		* Method name can be anything.
 		* Method may or may not return a value.
 		* If method is not returning any value, then specify void.
 		* Method can take parameters/ arguments
 		* We have to invoke/call methods explicitly through object.
 		* Used for specifying logic.
 
 --> Constructor:
 		* Constructor name should be same as class name.
 		* Constructor will never return a value (not even void).
 		* We dont specify the void.
 		* Constructor can take parameters/ arguments.
 		* Constructor automatically invoked at the time of object creation.
 		* Used for initializing the values of the variables.
 
 --> Types of constructors:
 		* Default
 		* Parameterized
 */



package day_10;

public class Student {
	
	int sid;
	String name;
	char grad;
	
	void printStudentData() {
		System.out.println(sid+"   "+name+"   "+ grad);
	}
	
	void setStudentData(int id, String sname, char gr) {
		sid=id;
		name=sname;
		grad=gr;
		
	}
	
	//Constructor name should be same as class name and used for only initialization. Constructor will not return any value not even void.
	Student(int id, String sname, char gr){
		sid=id;
		name=sname;
		grad=gr;
		
	}
	

}
