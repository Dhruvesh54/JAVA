/*9) Write a java program to count no of words from a given 
string.*/

import java.util.*;

class t1_9 {
	public static void main(String[] args) {
		String sr;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the value");
		sr = ob.nextLine();
		int count = 1;
		for (int i = 0; i < sr.length(); i++) {
			if (sr.charAt(i) == ' ' && sr.charAt(i + 1) != ' ') {
				count++;
			}
		}
		System.out.print("count=" + count);
	}
}
