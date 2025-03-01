/*
 * Class - collection of attributes and behavior.
 * Object - Instance of class.
 
 1) Class:
 	* collection of variables and methods.
 	* logical entity/blue print.
 	* will not occupy space in the memory.
 	* class Employee {
 		variables
 		methods
 		}
 		
 2) Object:
 	* Instance of a class/object will be created by using class.
 	* physical entity.
 	* occupy space in memory.
 	* can create multiple objects for single class.
 	* Syntax: Employee emp1=new Employee();
 */

package day9;

public class Class_Objects {
	
	//Variables
	int eid, sal;
	String ename, job;
	
	//Methods
	void display(){
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(job);
	}
	

	public static void main(String[] args) {
		
		Class_Objects emp1=new Class_Objects(); //object
		emp1.eid=101;
		emp1.ename="Ram";
		emp1.job="Manager";
		emp1.sal=50000;
		emp1.display();
		
		Class_Objects emp2=new Class_Objects();
		emp2.eid=102;
		emp2.ename="Chethana";
		emp2.job="Engineer";
		emp2.sal=1500000;
		emp2.display();
	}

}
