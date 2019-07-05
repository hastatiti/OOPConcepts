package NewFeatures;

public abstract class MyAbstract {
	public abstract String getName();
	public static void main(String[] args) {
		Flamingo f = new Flamingo();
		System.out.println(f.getName());
	}
}

class Bird extends MyAbstract {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	} // needs to implement abstract method
}
	class Flamingo extends Bird { //this class runs
		public String getName() {
			return "Flamingo";
			}
}