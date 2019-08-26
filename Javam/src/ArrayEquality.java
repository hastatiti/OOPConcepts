
public class ArrayEquality {
	public static void main(String[] args) {
		
//		array types don't override equals to provide value equality... 
//		the default implementation in Object, which is reference equality.
		int[] a = { 1, 2, 3 };
		int[] b = { 1, 2, 3 };
		int[] c = a;
		System.out.println(a.equals(b)); // false
		System.out.println(a == b);		 //	false
		System.out.println(a.equals(c)); //	true
		System.out.println(a == c);		 // true
	}
}
