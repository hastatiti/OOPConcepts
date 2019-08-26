import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] numbers = { 2, 4, 6, 8 };
		System.out.println(Arrays.binarySearch(numbers, 2));
		System.out.println(Arrays.binarySearch(numbers, 4));
		// it should be inserted at index 0 to preserve the sorted order so => -1 
		System.out.println(Arrays.binarySearch(numbers, 1));
		// it would need to be inserted at index 1 to preserve the sorted order so => -1 -1 = -2
		System.out.println(Arrays.binarySearch(numbers, 3));
		// it would need to be inserted at index 4 to preserve the sorted order so =>  = -1 -4 = -5
		System.out.println(Arrays.binarySearch(numbers, 9));
	}
}
