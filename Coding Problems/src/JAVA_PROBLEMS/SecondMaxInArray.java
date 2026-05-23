package JAVA_PROBLEMS;

public class SecondMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 15, 11, 0, 6, 23 };
		System.out.print(getMaxElement(a));

	}

	public static int getMaxElement(int[] a) {

		int max = -1;
		int smax = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				smax = max;
				max = a[i];

			} else if (a[i] < max && a[i] > smax) {
				smax = a[i];

			}

		}

		return smax;

	}

}
