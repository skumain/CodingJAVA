/*
 * 
 * Given a string consisting of lowercase english alphabets. Find the repeated character present first in the string.

NOTE - If there are no repeating characters return '#'.

Example 1:

Input:
S = "geeksforgeeks"
Output: g
Explanation: g, e, k and s are the repeating
characters. Out of these, g occurs first. 
*
*
*/

package JAVA_PROBLEMS;

public class First_Repeating_Character_in_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "sforgks";
		System.out.println(firstRep(s));

	}

	public static char firstRep(String s) {
		// your code here
		for (int i = 0; i < s.length(); i++) {

			for (int j = i + 1; j < s.length(); j++) {

				// System.out.println(" i = " +i + " j is " +j);

				if (s.charAt(i) == s.charAt(j)) {

					return (char) s.charAt(i);

				}
			}
		}
		return '#';
	}
}