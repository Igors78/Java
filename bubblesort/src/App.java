import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		int[] arr = new int[10];
		try (Scanner c = new Scanner(System.in)) {
			System.out.println("Enter 10 numbers to sort");
			for (int i = 0; i < 10; i++) {
				arr[i] = c.nextInt();
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println();
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
			for (int j = 0; j < 10; j++) {
				System.out.print(arr[j]);
				System.out.print(" ");
			}
			System.out.println("\nBubbling");
			size--;
		}
		for (int k = 0; k < 10; k++) {
			System.out.print(arr[k]);
			System.out.print(" ");
		}
		System.out.println("\nSorted with bubble sort");
	}
}
