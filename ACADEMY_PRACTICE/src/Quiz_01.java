public class Quiz_01 {

	public static void main(String[] ar) {
		
		// 문제1: 데이터형을 맞게 변환하세요.
		byte b = 10;
		short s = 20;
		char c = 'A';
		int i;
		float f;
		long l = 100L;
		
		s = b;
		c = b;
		s = c;
		c= s;
		i = 100L;
		l = 500;
		f = l;
		f = 5.11;
		
		s = b;
		c = (char) b;
		s = (short) c;
		c= (char) s;
		i = 100;
		l = 500;
		f = l;
		f = (float) 5.11;
		
		//문제2: 틀린 데이터형을 고르세요.
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		/*1*/ b = (byte) i;
		/*2*/ ch = (char) b;
		/*3*/ short s = (short) ch;
		/*4*/ float f = l; //실수형이 정수형보다 크기 때문에 굳이 캐스팅할 필요 없다.
		/*5*/ i = ch; //int가 char보다 크기 때문에 캐스팅할 필요가 없다.
		
		//문제3 아래 문제를 보고 결과가 어떻게 출력될지 적으세요.
		int i1 = 10;
		int i2 = 20;
		float f1 = 3.14f;
		char c1 = 'A';
		char c2 = 'B';
		
		System.out.println("결과 : " + i1 + i2);
		System.out.println("결과 : " + (i1 + i2));
		System.out.println("결과 : " + i1 + f1);
		System.out.println("결과 : " + (i1 + f1));
		System.out.println("결과 : " + f1 + c1);
		System.out.println("결과 : " + (f1 + c1));
		System.out.println("결과 : " + c1 + c2);
		System.out.println("결과 : " + (c1 + c2));
		
		//모르겠음 괄호가 있어야 숫자로 인식을 하나? 왜 괄호만 계산이 되지
		
	
		
	}
}
