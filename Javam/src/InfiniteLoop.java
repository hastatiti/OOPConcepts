
public class InfiniteLoop {
	public void loop() {
		int x = 0;
		while (true) {
			for (int m = 10; m >= 0; m--) {
				System.out.println(x);
				x = m;
				
			}
		}
	}
	public static void main(String[] args) {
		InfiniteLoop l = new InfiniteLoop();
		l.loop();
	}
}
