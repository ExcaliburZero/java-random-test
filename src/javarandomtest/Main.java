//package javarandomtest;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random r = new Random();
		int numbers = 6;
		int total = 1000;
		int [] randoms = new int[numbers];
		int curRand;

		for(int i = 0; i < total; i++) {
			curRand = r.nextInt(numbers);
			randoms[curRand] += 1;
			System.out.print(curRand + " ");
		}

		System.out.println();

		for(int i = 0; i < numbers; i++) {
			System.out.print(i + ": " + randoms[i]);
			System.out.print("\t" + randoms[i](double));
			System.out.println();
		}
	}
}
