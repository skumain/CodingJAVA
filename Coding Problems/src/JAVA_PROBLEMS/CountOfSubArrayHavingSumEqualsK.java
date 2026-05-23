package JAVA_PROBLEMS;

public class CountOfSubArrayHavingSumEqualsK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 9, 4, 20, 3, 10, 5 };
		int target = 33;
		int counter = 0;

		for (int i = 0; i < x.length; i++) {
			int sum = 0;

			for (int j = i; j < x.length; j++) {

				sum += x[j];
				if (sum == target)
					counter++;

			}

		}
		System.err.println("no of subarray " + counter);
	}

}
