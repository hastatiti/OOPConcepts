
public class StaticAndInstance2 {
	
//	public static final int NUM_OF; // final variable needs initialization
//	public final int num;			// final variable needs initialization
	
	public static void myStatic2() {
		StaticAndInstance si = new StaticAndInstance();
		si.myStatic();
		StaticAndInstance.myStatic();
	}
	public static void main(String[] args) {
		myStatic2();
	}
}
