import java.util.Scanner;
import java.util.Arrays;

public class App {
	public static void main(String[] args) throws Exception {
		int[] arr = new int[10];
		try (Scanner c = new Scanner(System.in)) {
			System.out.println("Enter 10 numbers to sort");
			for (int i = 0; i < 10; i++) {
				arr[i] = c.nextInt();
			}
		}
		String str = Arrays.toString(arr);
		System.out.println("Initial array");
		System.out.println(str);
		System.out.println("Sorting step by step");
		int tmp, i = 0, size = arr.length - 1;
		boolean swap = true;
		while (swap) {
			swap = false;
			i = 0;
			while (i < size) {
				if (arr[i] > arr[i + 1]) {
					tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
					swap = true;
				}
				i++;
			}
			str = Arrays.toString(arr);
			System.out.println(str);
			System.out.println("Bubbling");
			size--;
		}
		str = Arrays.toString(arr);
		System.out.println(str);
		System.out.println("Sorted with bubble sort");
	}
}
