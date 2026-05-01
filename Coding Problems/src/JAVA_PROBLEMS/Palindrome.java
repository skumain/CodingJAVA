//  A given number can be said to be palindromic if the reverse of the given number is the same as that of a given number.

package JAVA_PROBLEMS;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1551;
		if (x == isPalindrome(x))
			System.out.println(x + " and " + isPalindrome(x) + " yes");
		else
			System.out.println("no");

	}

	public static int isPalindrome(int x) {
		int s = 0;

		while (x > 0) {
			int r = x % 10;
			s = s *10 + r ;
			x = x / 10;

		}
		return s;

	}

}
