
public class EqualsTest {
public static void main(String[] args) {
	Tiger t1 = new Tiger();
	Tiger t2 = new Tiger();
	int [] a1 = {1,2};
	int [] a2 = {1,2};
	int [] a3 = a1;
	System.out.println(t1 == t2);
	System.out.println(t1.equals(t2));
	System.out.println(a1 == a2);
	System.out.println(a1.equals(a2));
	System.out.println(a1 == a3);
	System.out.println(a1.equals(a3));
}
}
class Tiger{
	
}