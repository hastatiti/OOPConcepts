package NewFeatures;

class CanRedefine {
	private String myString() {
		return "ParentString";
	}
}

public class InheritPrivate extends CanRedefine {
	// private String myString() {
	// return "ChildString"; //inherited method
	// }
	private int myString() { // redefined method, not inherited
		return 10;
	}

	public static void main(String[] args) {
		InheritPrivate i = new InheritPrivate();
		System.out.println(i.myString());
	}
}
