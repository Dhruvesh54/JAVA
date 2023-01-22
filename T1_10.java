/*10) Write a java program to find the smallest and second 
smallest number from a given array and add both those numbers.*/

import java.util.*;

class t1_10 {

	public static void main(String args[]) {
		int arr[] = { 111, 13, 25, 9, 34, 1 };
		int n = arr.length;

		// sorting the array using
		// in-built sort function
		Arrays.sort(arr);

		// printing the desired element
		System.out.println("smallest element is " + arr[0]);
		System.out.println("second smallest element is " + arr[1]);
		int add = arr[0] + arr[1];
		System.out.println("sum is " + add);
	}
}
