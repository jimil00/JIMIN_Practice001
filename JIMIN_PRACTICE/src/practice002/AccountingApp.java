package practice002;

public class AccountingApp {

	public static void main(String[] args) {
	
    // 사업을 한다는 가정하에 소비자가, 순이익, 투자자들에게 줘야할 배당금이 얼마인지 계산할 수 있는 프로그램 만들기
		
		
	// 공급가
	System.out.println("Value of supply : "+12345.0);
	// 부가가치세                  
	System.out.println("VAT : "+(12345.0*0.1));
	// 소비자가 (공급가+부가가치세)                 
	System.out.println("Total : "+(12345.0 + 12345.0*0.1));
	// 비용
	System.out.println("Expense : "+(12345.0*0.3));
	// 이익 (공급가-비용)
	System.out.println("Income : "+(12345.0 - 12345.0*0.3));
	// 배당 (이익*배당)
	System.out.println("Dividend 1 : "+(12345.0 - 12345.0*0.3) * 0.5);
	System.out.println("Dividend 2 : "+(12345.0 - 12345.0*0.3) * 0.3);
	System.out.println("Dividend 3 : "+(12345.0 - 12345.0*0.3) * 0.2);
	
	// 계산할 금액을 변경하고 싶다면: 공급가액 드래그 -> <Edit> -> <Find/Replace> -> replace with 칸에 원하는 금액 입력
	
	}

}
