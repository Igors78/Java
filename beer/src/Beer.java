public class Beer {
	public static void main(String[] args) throws Exception {
		int beerNum = 10;
		String word = "bottles ";

		while (beerNum > 0) {
			if (beerNum == 1)
				word = "bottle ";
			System.out.println(beerNum + " " + word + "of beer on the wall");
			System.out.println(beerNum + " " + word + "of beer.");
			System.out.println("Take one");
			System.out.println("make it to the round.");
			beerNum--;
			if (beerNum == 1)
				word = "bottle ";
			if (beerNum > 0)
				System.out.println(beerNum + " " + word + "of beer on the wall");
			else
				System.out.println("No beer on the wall");
		}
	}
}
