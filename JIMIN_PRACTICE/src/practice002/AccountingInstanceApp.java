package practice002;

class Accounting2{
	 public double ValueOfSupply;
     public double vatRate;
     public double expenseRate; 
     public void print() {
 		System.out.println("Value of supply : "+ValueOfSupply);                
 		System.out.println("VAT : "+ getVAT());               
 		System.out.println("Total : "+ getTotal());
 		System.out.println("Expense : "+ getExpense());
 		System.out.println("Income : "+ getincome());
 		System.out.println("Dividend 1 : "+ getdividend1());
 		System.out.println("Dividend 2 : "+ getdividend2());
 		System.out.println("Dividend 3 : "+ getdividend3());
 	}

 	public double getdividend1() {
 		return getincome() * 0.5;
 	}
 	
 	public double getdividend2() {
 		return getincome() * 0.3;
 	}
 	
 	public double getdividend3() {
 		return getincome() * 0.2;
 	}

 	public double getincome() {
 		return ValueOfSupply - getExpense();
 	}

 	private double getExpense() {
 		return ValueOfSupply*expenseRate;
 	}

 	private double getTotal() {
 		return ValueOfSupply + getVAT();
 	}

 	private double getVAT() {
 		return ValueOfSupply*vatRate;
 	}
     
}
public class AccountingInstanceApp {
  
	public static void main(String[] args) {
	
		// 이것이 instance
		Accounting2 a1 = new Accounting2();
		a1.ValueOfSupply = 25000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		Accounting2 a2 = new Accounting2();
		a2.ValueOfSupply = 46000.0;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();
		
		a1.print();
	}

}


//객체지향에는 클래스와 인스턴스가 있다.
//Class: 서로 연관된 변수와 메소드를 그룹화해서 이름을 붙인 정리정돈의 상자이다.
//Instance: 하나의 클래스를 복제해서 서로 다른 데이터의 값과 서로 같은 메소드를 가진 복제본을 만드는 것이다.


