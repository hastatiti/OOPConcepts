package NewFeatures;

import java.util.ArrayList;
import java.util.List;

public class MoveArrayList {
	public static List<String> myList = new ArrayList();
	public static void main(String[] args) {
		myList.add("a");
		myList.add("b");
		myList.add("c");
		System.out.println(myList);
		int i = myList.indexOf("a");
		myList.add(0,"new a");
		System.out.println(myList);
	}
	
}
