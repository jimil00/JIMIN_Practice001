package practice002;

public class AccountingArrayLoopApp {

	public static void main(String[] args) {
	

		double ValueOfSpply = Double.parseDouble(args[0]);
		double vatRate = 0.1;	
		double expenseRate = 0.3;		
		double vat = ValueOfSpply*vatRate;	
		double total = ValueOfSpply + vat;		
		double expense = ValueOfSpply*expenseRate;		
		double income = ValueOfSpply - expense;		
		
		
		System.out.println("Value of supply : "+ValueOfSpply);                
		System.out.println("VAT : "+vat);               
		System.out.println("Total : "+total);
		System.out.println("Expense : "+expense);
		System.out.println("Income : "+income);
		
		double [] dividendRates = new double [3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2; 
		
		
		int i = 0;
		while ( i < dividendRates.length ) {
		System.out.println("Dividend 1 : "+ (income * dividendRates[1]));
		i = i+1;
	}

  }
}
