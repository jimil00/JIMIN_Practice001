package practice004;

class Accounting {
    public static double ValueOfSupply;
	public static double vatRate = 0.1;
	public static double getVAT() {
		return ValueOfSupply * vatRate;
	}
	
	public static double getTotal() {
		return ValueOfSupply + getVAT();
	}
}

public class AccountingApp {
    
	public static void main(String[] args) {

		Accounting.ValueOfSupply = 10000.0;
		System.out.println("Value of supply : "+Accounting.ValueOfSupply);                
		System.out.println("VAT : "+Accounting.getVAT());               
		System.out.println("Total : "+Accounting.getTotal());
	

	}

}
	