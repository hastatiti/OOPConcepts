class A {
	public static void display() {
		System.out.println("superclass");
	}
}

class B extends A {
	public void show() {
		display();
	}

	public static void display() {
		System.out.println("subclass");
	}
}

public class InheritanceTest {
	public static void main(String[] args) {
		A a = new B();
		a.display();
		
		B b = new B();
		b.display();
	}
}