/*11) Write a java program to find the biggest difference from a 
given array.*/

import java.util.*;

class t1_11 {
	public static void main(String[] args) {
		int i, j;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter length of array:");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter element of array:");
		for (i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int d, g = 0, a1 = 0, a2 = 0;
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {

				d = Math.abs(a[i] - a[j]);
				if (d > g) {
					g = d;
				}
			}
		}
		System.out.println("Gratest difference :" + g);
	}
}