package JAVA_PROBLEMS;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 6, 5, 14, 23, 19, 15, 25, 0, 3 };
		justsort(a);
	}

	public static void justsort(int a[]) {

		int k = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					k = a[i];
					a[i] = a[j];
					a[j] = k;
				}

			}
		}

		System.out.println(Arrays.toString(a));
	}

}
