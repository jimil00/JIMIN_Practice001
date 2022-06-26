package practice004;

class App {
    public double ValueOfSupply;
	public static double vatRate = 0.1;
	public App(double ValueOfSupply) {
		this.ValueOfSupply = ValueOfSupply;
	}
	public double getVAT() {
		return ValueOfSupply * vatRate;
	}
	
	public double getTotal() {
		return ValueOfSupply + getVAT();
	}
}

public class AccountingApp2 {
    public static void main(String[] args) {
    	
    	App a1 = new App(10000.0);
    	a1.ValueOfSupply = 10000.0;
    	
    	App a2 = new App(20000.0);
    	a2.ValueOfSupply = 20000.0;
    	
    	System.out.println("Value Of Supply : " + a1.ValueOfSupply);
    	System.out.println("Value Of Supply : " + a2.ValueOfSupply);
    	
    	System.out.println("VAT : "+a1.getVAT());     
    	System.out.println("VAT : "+a2.getVAT());    
    	
    	System.out.println("Total : "+ a1.getTotal());
    	System.out.println("Total : "+ a2.getTotal());

		
	}

}
	