import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random r = new Random();	// Random number generator object
		int numbers = 6;	// The number of possible result numbers
		int total = 100000;	// The number of tests
		int [] randoms = new int[numbers];	// Array of results
		int curRand;	// The currently selected random number
		double percent;	// The percent occurance of the current number
		double expectedPercent;	// The expected occurance percentage for each number
		double percentDifference;	// THe difference between the expected and actual percents

		// Calculate the expected percent for each number
		expectedPercent = (100.0 / (double)numbers);
		System.out.println(expectedPercent);

		// Generate the random numbers, store them in an array, and print them to the screen
		for(int i = 0; i < total; i++) {
			curRand = r.nextInt(numbers);
			randoms[curRand] += 1;
			System.out.print(curRand + " ");
		}
		System.out.println();

		// Display the results of the tests
		for(int i = 0; i < numbers; i++) {
			percent = (randoms[i] / (double)total) * 100.0;
			percentDifference = percent - expectedPercent;

			System.out.print(i + ": " + randoms[i]);
			System.out.print("\t" + percent + " %");
			System.out.print("\t");
			if(percentDifference >= 0) {
				System.out.print(" ");
			}
			System.out.print(percentDifference);
			System.out.println();
		}
	}
}
