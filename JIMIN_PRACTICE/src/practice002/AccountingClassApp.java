package practice002;

class Accounting{
	 public static double ValueOfSpply;
     public static double vatRate;
     public static double expenseRate;
     
     public static void print() {
 		System.out.println("Value of supply : "+ValueOfSpply);                
 		System.out.println("VAT : "+ getVAT());               
 		System.out.println("Total : "+ getTotal());
 		System.out.println("Expense : "+ getExpense());
 		System.out.println("Income : "+ getincome());
 		System.out.println("Dividend 1 : "+ getdividend1());
 		System.out.println("Dividend 2 : "+ getdividend2());
 		System.out.println("Dividend 3 : "+ getdividend3());
 	}

 	public static double getdividend1() {
 		return getincome() * 0.5;
 	}
 	
 	public static double getdividend2() {
 		return getincome() * 0.3;
 	}
 	
 	public static double getdividend3() {
 		return getincome() * 0.2;
 	}

 	public static double getincome() {
 		return ValueOfSpply - getExpense();
 	}

 	private static double getExpense() {
 		return ValueOfSpply*expenseRate;
 	}

 	private static double getTotal() {
 		return ValueOfSpply + getVAT();
 	}

 	private static double getVAT() {
 		return ValueOfSpply*vatRate;
 	}
     
}
public class AccountingClassApp {
  
	public static void main(String[] args) {
		Accounting.ValueOfSpply = 12452.0;
		Accounting.vatRate = 0.1;	
		Accounting.expenseRate = 0.3;		
		Accounting.print();	
        
	}

}

//객체지향에는 클래스와 인스턴스가 있다.
//Class: 서로 연관된 변수와 메소드를 그룹화해서 이름을 붙인 정리정돈의 상자이다.

