package practice003;

public class OutputMethod {

	public static String a() {
		
		return "a";
	}
	
	public static int one () {
		return 1;
		
	}
	
	public static void main (String[] args) {
		
	System.out.println(a());
	System.out.println(one());
	}
}

//메소드 리턴값 뒤에 있는 값이 그 메소드의 실행결과가 된다.
//리턴값은 그 메소드를 종료시키는 역할도 한다. 리턴 뒤에 아무리 많은 코드가 있어도 앞에 리턴이 있으면 메소드는 거기서 끝난다.
//void는 리턴값이 없다는 뜻이다.