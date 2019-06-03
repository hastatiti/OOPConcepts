package NewFeatures;

public class SuperConstructor {
	public static void main(String[] args) {
		Animal a = new  Animal(8);
		System.out.println(a);
		System.out.println(a.getAge());
		Zebra z = new Zebra(4);
		System.out.println(z);
		Animal an = new Zebra(10);
		System.out.println(an);
		Animal anim = new Zebra();
		System.out.println(anim);
	}
}


class Animal{
	private int age;
	public Animal(int age) {
		super();
		this.age = age;
	}
	public int getAge(){
		return age;	
	}
	@Override
	public String toString() {
		return "Animal age = 8";
	}
}
class Zebra extends Animal{

	public Zebra(int age) {
		super(age);
	}
	public Zebra() {
		this(14);
	}
	@Override
	public String toString() {
		return "Zebra age = " + getAge();
	}
	
}
	