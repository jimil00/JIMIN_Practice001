package practice004;

class Foo{
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	public static void classMethod() {
		System.out.println(classVar); // OK
//		System.out.println(instanceVar); // Error
	}
	public void instanceMethod() {
		System.out.println(classVar); //OK
		System.out.println(instanceVar); //OK
	}
}
public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar); //OK
//		System.out.println(Foo.instanceVar); //Error: 인스턴스는 인스턴스를 통해서 사용하도록 보완된 변수다.
		Foo.classMethod();
//		Foo.instanceMethod();// Error
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar); // I class var
		System.out.println(f1.instanceVar); // I instance var
		
		f1.classVar = "changed by f1";
		System.out.println(Foo.classVar); // changed by f1
		System.out.println(f2.classVar); // changed by f1
		
		f1.instanceVar = "changed by f1";
		System.out.println(f1.instanceVar); // changed by f1
		System.out.println(f2.instanceVar); // I instance var
	}

}


//클래스를 통해 인스턴스변수 또는 인스턴스메소드에 접근하는 것은 허용되지 않는다.

