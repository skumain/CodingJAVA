package JAVA_PROBLEMS;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithSumZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 4, 2, 8, 1, 6 };
		System.out.println(getZeroSumArray(a));

	}

	public static boolean getZeroSumArray(int x[]) {
		Set<Integer> prefixsum = new HashSet<Integer>();

		int sum = 0;

		for (int i = 0; i < x.length; i++) {
			sum += x[i];
			if (sum == 0 || prefixsum.contains(sum)) {

				return true;

			} else
				prefixsum.add(sum);

		}

		return false;

	}

}
