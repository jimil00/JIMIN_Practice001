package practice003;

public class WhyMethod2 {
	
	public static void main(String[] args) {
		
		             //"a"나 "-" 처럼 함수 안으로 주입한 구체적인 값을 인자(argument)라고 부른다.
		printTwoTimes("a", "-");	
	    printTwoTimes("a", "*");		
	    printTwoTimes("a", "&");
	    printTwoTimes("b", "!");
	}
                                     //String text나 String delimeter 처럼 메소드를 사용하는 쪽에서 주입한 값을 메소드 안으로 흘려 보내주는 매개자를 매개변수(parameter)라고 부른다. 
	public static void printTwoTimes(String text, String delimeter) {
		System.out.println(delimeter);
		System.out.println(text);
		System.out.println(text);
	}

}



