/*
--> Encapsulation - Wrapping of data and methods into single unit.
		* All variables should be private.
		* For every variable there should be 2 methods (get & set)
		* Variables can be operated only through methods.
 */
package day_11;

public class Encapsulation {

	private int accno;
	private String name;
	private double amount;
	
	/*void setAccno(int accno) {
		this.accno=accno;
	}
	
	int getAccno() {
		return accno;
	}
	*/
	
	// Soure --> Setters and Getters --> select all and generate! - EASIEST WAY
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	

}
