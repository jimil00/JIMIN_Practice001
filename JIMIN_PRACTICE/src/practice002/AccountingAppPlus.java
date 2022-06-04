package practice002;

public class AccountingAppPlus {

	public static void main(String[] args) {
	
// 그 전의 프로그램보다 더 편리한 방법: 변수화 시키기
		
		// 공급가 변수
		double ValueOfSpply = 12546.0;
		// 부가가치세율 변수
		double vatRate = 0.1;
		// 비용율 변수
		double expenseRate = 0.3;
		// 부가가치세 변수
		double vat = ValueOfSpply*vatRate;
		// 소비자가 변수
		double total = ValueOfSpply + vat;
		// 비용 변수
		double expense = ValueOfSpply*expenseRate;
		// 이익 변수
		double income = ValueOfSpply - expense;
		// 배당금 변수
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;
		
		System.out.println("Value of supply : "+ValueOfSpply);                
		System.out.println("VAT : "+vat);               
		System.out.println("Total : "+total);
		System.out.println("Expense : "+expense);
		System.out.println("Income : "+income);
		System.out.println("Dividend 1 : "+dividend1);
		System.out.println("Dividend 2 : "+dividend2);
		System.out.println("Dividend 3 : "+dividend3);
		
		//변수화 방법: 원하는 부분 드래그 -> 우클릭 -> Refactor -> Extract Local Variable -> 이름 지정 / Ctrl+Alt+L
		// 변수화 시킨 후 공급가액에 원하는 금액 입력하면 끝!!

	}

}
