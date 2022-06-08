package practice003;

public class WhyMethod {
	
	public static void main(String[] args) {
		
		printTwoTimesA();	
	    printTwoTimesA();		
        printTwoTimesA();
   
	}

	public static void printTwoTimesA() {
		System.out.println("-");
		System.out.println("A");
		System.out.println("A");
	}

}



//반복적인 코드가 일억줄이고 일억번 반복이 될 때, 내가 작업했던 코드의 문구를 수정해야 할 때를 가정해보자. 일억줄의 코드를 바꾸는 것은 매우 힘들 것이다. 메소드란 서로 연관된 코드를 그룹화해서 이름을 붙인 정리정돈의 상자이다.
//Method 생성법: 메소드 하고 싶은 부분 드래그 후 우클릭 -> Refactor -> Extract Method.. -> 이름 지정 / 단축키: Alt+Shift+M