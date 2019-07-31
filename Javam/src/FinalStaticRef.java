import java.util.ArrayList;

public class FinalStaticRef {
	private static final ArrayList<String> values = new ArrayList<>();
	private static ArrayList<String> values2 = new ArrayList<>();
	private static ArrayList<String> values3 = new ArrayList<>();
	public static void main(String[] args) {
		values.add("changed");
		System.out.println(values);
		values2 = values;
		System.out.println(values2);
	//	values = values3; //does not compile, trying to reassign final reference
	}
}
