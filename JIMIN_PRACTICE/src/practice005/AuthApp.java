package practice005;

public class AuthApp {

	public static void main(String[] args) {
		
		
		String id = "egoing";
		String inputId = args[0];
		
		String pass = "1111";
		String inputPass = args[1];
		
		System.out.println("Hi.");
		
		
		if(inputId.equals(id) && inputId.equals(pass)) {
			System.out.println("Marster!");
			} else {
			System.out.println("Who are you?");
		}
	}
	
}


