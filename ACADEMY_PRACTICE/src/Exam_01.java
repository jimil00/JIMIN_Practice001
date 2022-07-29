import java.lang.*;

 public class Exam_01 { 
 //파일명과 똑같이 만들 것. 반드시 필요한 코드이다. 괄호는 범위를 지정해주는 역할을 한다.
  public static void main(String[] ar){ 
  //초기 실행 위치이다. 여기까지가 코드를 짜기 위한 기본적이고 필수적인 코드.
	  
  System.out.println("Hello world");
  //Hello world라고 출력해라. 
  //println에서 ln는 줄을 바꿔주는 뜻이다. ln를 안쓰면 줄이 바뀌지 않는다.
  
  System.out.println("안녕하세요.");
  System.out.println(10);
  System.out.println('A');
  System.out.println(3.14);

  }

}

 

/*
문자열을 표현할 때는 ""를 사용한다.
문자를 표현할 때는 ''를 사용한다.
숫자를 표현할 때는 Quote를 사용하지 않는다.

데이터의 타입은 유형에 따라 Quote를 쓰는게 아니라 Quote에 따라 타입이 달라지는 것이다.
*/


/*
-괄호 넣는 방식

1. BSD방식

코드

{

}


2. K&R방식 -> 가장 많이 쓰는 방식

코드{

}


3. GNU방식 -> 거의 안씀

코드

{

}
*/

//전체 주석 처리 해주는 단축키: 원하는 부분 드래그후 컨트롤+/