
class Marsupial {
	String name = "Marsupial";

	public boolean isBiped() {
		return false;
	}

	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on two legs: " + isBiped());
	}
}

public class Kangaroo extends Marsupial {
	String name = "Kangaroo";

	public boolean isBiped() {
		return true;
	}

	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: " + isBiped());
	}

	public static void main(String[] args) {
	//	Kangaroo joey = new Kangaroo();
		Marsupial mars = new Marsupial();
		Marsupial joey = new Kangaroo();
		Kangaroo kang = new Kangaroo();
		System.out.println(kang.name);
 		System.out.println(mars.name);
		System.out.println(joey.name);
//		joey.getMarsupialDescription();
//		joey.getKangarooDescription();
	}
}