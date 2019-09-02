package NewFeatures;

import java.util.Arrays;
import java.util.List;

public class LambdaExample {
	public static void main(String[] args) {
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API"); 
//		for (String n : features) { System.out.println(n); }
	//	features.forEach( n -> System.out.println(n));
		features.forEach((String n) -> System.out.println(n));
		
	}
}
