package practice002;

public class AccountingMethodApp {
    public static double ValueOfSpply;
	public static double vatRate;
	public static double expenseRate;
	public static void main(String[] args) {
		ValueOfSpply = 12452.0;
		vatRate = 0.1;	
		expenseRate = 0.3;		
		
		print();	

}

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

//Method: 서로 연관된 코드를 그룹화해서 이름을 붙인 정리정돈의 상자이다.
//Method 생성법: 메소드 하고 싶은 부분 드래그 후 우클릭 -> Refactor -> Extract Method.. -> 이름 지정 / 단축키: Alt+Shift+M

//전역변수(Global variable)와 지역변수(Local variables): 전체에서 어디서든 호출하면 사용할수 있는 변수는 전역변수. 특정한 구역({ })안에 생성되어 그 지역에만 사용할수 있는 변수는 지역변수이다.
//전역변수 생성법: 하고 싶은 부분 드래그 후 우클릭 -> Refactor -> Convert Local Variable to Field... -> pubilc 