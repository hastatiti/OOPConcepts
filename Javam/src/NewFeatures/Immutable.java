package NewFeatures;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Immutable {
public static void main(String[] args) {
	String s1 = "MyString";
	String s2 = s1.concat("ss");
	System.out.println(s2);
	s1 = s1.concat("qqqq");
	System.out.println(s1);
	
	LocalDate d1 = LocalDate.of(2010, 11, 1);
//	LocalDateTime d2 = LocalDateTime(2010, 11, 1);
	System.out.println(d1);
	// d1 = d1.minutes(1); does not compile
	System.out.println(d1);
	
	LocalDate l = LocalDate.of(2000, 10, 21);
	LocalTime t = LocalTime.of(10, 56);
	LocalDateTime lt = LocalDateTime.of(l, t);
	System.out.println(lt);
}
}
