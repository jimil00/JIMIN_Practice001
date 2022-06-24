package practice004;

public class MyOOP3 {
	
	public static void main(String[] args) {
		Print p1 =  new Print();
		p1.delimiter = "----";
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		Print p2 = new Print();
		p2.delimiter = "****";
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
		p1.A();
		p2.A();
		p1.A();
		p2.A();
		
	}
	
}

// 클래스가 원본이라면 인스턴스는 원본의 구성 일부를 바꿀 수 있다.
