public class BinaryToString {
	public static void main(String[] args) {
		int N = 10;
		String s = "";
		for (int n = N; n > 0; n /= 2) {
			s = (n % 2) + s;
			System.out.println(s);
		}
	}
}