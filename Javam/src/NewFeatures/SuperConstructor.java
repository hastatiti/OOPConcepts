package NewFeatures;

public class SuperConstructor {
	public static void main(String[] args) {
		Animal a = new  Animal(8);
		System.out.println(a);
		System.out.println(a.getAge());
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
		return "age = 8";
	}
	
}