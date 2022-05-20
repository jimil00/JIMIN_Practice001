package practice001;

public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		
		System.out.println(b);
		
		// double은 실수 함수이지만 1은 1.0도 되기 때문에 손실이 없다.
		// 손실이 없을 경우엔 이클립스가 자동으로 바꿔 출력해준다. 
		
	
		// int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1;
		
		// int는 정수 함수이다. 1과 1.1은 같지 않기 때문에 이클립스가 자동으로 바꿔 주기엔 손실이 있다.
	    // 손실이 있는 경우엔 이클립스가 자동으로 바꿔주지 않기 때문에 내가 수동으로 바꿔 주어야한다.
		
		System.out.println(e);
		
		// 1 to String
		String f = Integer.toString(1);
		System.out.println(f);
		
		
		
		// 자바에서는 변수의 데이터 타입 형태를 엄격하게 통제하기 때문에 
		// 어떤 변수에 들어갈 값, 들어있는 값을 다른 데이터 타입으로 컨버팅해야하는 경우가 생기는데 그때이 키워드가 캐스팅이다.

	}

}
