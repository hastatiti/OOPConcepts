import java.util.ArrayList;
import java.util.*;

public class Initilization {
	
	static List<Integer> l = new ArrayList();
	static{
		l.add(null);
	}
	static void getNull() {
		System.out.println(l);
	//	int i = l.get(0); //throws exception,trying to unbox null into int
		Integer j = l.get(0); //compiles, null can be referenced by Wrapper
	}
	static int x=10;static int y;
	public static void main(String[] args) {
		System.out.println("x is=" + x + " y is=" + y);
		getNull();
	}
	
	
}
