import java.util.Arrays;

public class Arr {
	public static int result[][] = new int[2][];
	public static int array[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

	public static void main(String args[]) {
		int firstPart = array.length % 2 == 0 ? array.length / 2
				: array.length / 2 + 1;
		result[0] = Arrays.copyOfRange(array, 0, firstPart);
		result[1] = Arrays.copyOfRange(array, firstPart, array.length);
		System.out.println(Arrays.deepToString(result));
	}
}