import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntoArray {
	public static void main(String[] args) {
		List <Integer> myList = new ArrayList();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		int [] intArray = new int[myList.size()];
		
		for(int i = 0; i < myList.size(); i++) {
			
			intArray[i] = myList.get(i);
			System.out.println(Arrays.toString(intArray));
		}
		
		//null pointer exeption,assigns intArray[1] to 1,then intArray[2] to 2
//		for(int i : myList) {
//			intArray[i] = i;
//			System.out.println(i);
//			System.out.println(Arrays.toString(intArray));
//		}
		
		
	}
	
}
