
public class Finalizer {
	protected void finalize() {
		System.out.println("calling finalize");
	}
	public static void main(String[] args) {
		Finalizer f = new Finalizer();
	}
}
