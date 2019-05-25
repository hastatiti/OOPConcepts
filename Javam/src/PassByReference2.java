
public class PassByReference2 {
	public static void speak(StringBuilder s) { 
		s.append("Webby"); // calls method on given parameter, not reassigning
							// so it will change the value
	}

	public static void speak(String name) {
		name = "Sparky";
	}

	public static void main(String[] args) {
		StringBuilder name = new StringBuilder();
		speak(name);
		System.out.println(name); // Webby
		
		String name2 = "Webby";
		speak(name2);
		System.out.println(name2); //does not change to Sparky,method call 
									// doesnt change the variable name2
	}
}
