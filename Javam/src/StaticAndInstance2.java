
public class StaticAndInstance2 {
	public static void myStatic2() {
		StaticAndInstance si = new StaticAndInstance();
		si.myStatic();
		StaticAndInstance.myStatic();
	}
	public static void main(String[] args) {
		myStatic2();
	}
}
