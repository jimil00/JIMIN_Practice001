package practice003;

public class AccountingAppMethod {
	
	
	public static double ValueOfSupply = 10000.0;
	
	public static double vatRate = 0.1;
			
	public static double getVAT() {
		return ValueOfSupply*vatRate;
	}
	
	public static double getTotal() {
		return ValueOfSupply + getVAT();
	}

	public static void main(String[] args) {

		
		System.out.println("Value of supply : "+ValueOfSupply);                
		System.out.println("VAT : "+getVAT());               
		System.out.println("Total : "+getTotal());
	

	}

}
