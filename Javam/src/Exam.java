
public class Exam {
	String name;
	public Exam(String name) {
		this.name = name;
	}
	int result = 88;
	public void check1() {
		if(result < 78) {
			Exam exam1 = new Exam("Android");
			System.out.println(exam1.name);
		}else {
			Exam exam2 = new Exam("MySQL");
			System.out.println(exam2.name);
		}
	}
	public static void main(String[] args) {
		Exam ex = new Exam("a");
		ex.check1();
	}
}
