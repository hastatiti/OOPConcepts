import java.util.Arrays;

public class ArraySize {
	public static void main(String[] args) {
		int [] vars1 []  , vars2 [][] ;
		vars1 = new int[2][0];
		vars2 = new int[2][3][2];
		System.out.println(vars1.length);
		System.out.println(vars2.length);
	}
}
