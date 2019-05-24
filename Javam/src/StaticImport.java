import java.util.List;
import static java.util.Arrays.asList;
import static java.util.Arrays.*;
//import static java.util.Arrays;	 //does not compile,trying to import whole class,
									//but it needs to import members
public class StaticImport {
	public static void main(String[] args) {
		List<String> list = asList("one", "two");
		System.out.println(list);
	}
}
