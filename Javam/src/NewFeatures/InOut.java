package NewFeatures;

import java.util.Scanner;

public class InOut {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String rawLine = sc.nextLine();
			String[] line = rawLine.split(" => ");
			if(line.length == 1)
			System.out.println(line[0]);
		}
	}
}
