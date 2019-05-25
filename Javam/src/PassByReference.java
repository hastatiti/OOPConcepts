
public class PassByReference {
	public static int number(int number) {
		number++;
		return number;
	}
	public static String letters(String letters) {
		letters += "d";
		return letters;
	}
	public static void main(String[] args) {
		int number = 1;
		String letters = "abc";
		number(number);
		letters = letters(letters);//doesnt reassign String => abc
		letters(letters);// does reassign String => abcd
		System.out.println(number + " " + letters); 
	}
}
