package JAVA_PROBLEMS;

import java.util.Arrays;

public class StringCaseConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ABCddE";
		char[] carray = s.toCharArray();

		for (int i = 0; i < carray.length; i++) {
			if (carray[i] >= 'A' && carray[i] <= 'Z') {

				carray[i] = (char) (carray[i] + 32);

			}
		}

		System.out.println(String.valueOf(carray));
	}

}
