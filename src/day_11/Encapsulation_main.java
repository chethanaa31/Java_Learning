package day_11;

public class Encapsulation_main {

	public static void main(String[] args) {
		Encapsulation acc=new Encapsulation();
		
		acc.setAccno(101);
		acc.setName("Chethu");
		acc.setAmount(1500000.98);
		
		System.out.println(acc.getAccno());
		System.out.println(acc.getName());
		System.out.println(acc.getAmount());
		
		

	}

}
