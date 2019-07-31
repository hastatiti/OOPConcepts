
public class CompoundOperators {
	public static void main(String[] args) {
		int a = 1;
		long b = 2;
		long c = a * b; 
		int d = 2;
//		d = b * a; long cannot be assigned to int use compound below
		d *=a;    // now works
		
		short s1 = 1;
		short s2 = 2;
	//	short s3 = s1 * s2; int cannot be assigned to short
		
	}
}
