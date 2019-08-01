import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAndList {
public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("hawk");
	list.add("robin");
	String[] s = list.toArray(new String[3]);
	System.out.println(s.length);
}
}
