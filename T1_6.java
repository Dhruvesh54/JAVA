/*6) Write a java program that counts the number of days of 
the mentioned month in specified year using switch case 
statement.*/

import java.util.*;

class t1_6 {
	public static void main(String[] args) {
		Scanner dk = new Scanner(System.in);
		System.out.println("Enter Year");
		int y = dk.nextInt();
		System.out.println("Enter month");
		int m = dk.nextInt();
		switch (m) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("\n 31 Days in this Month");
				break;

			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("\n 30 Days in this Month");
				break;

			case 2:
				if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)) {
					System.out.println("\n 29 Days in this Month");
				}

				else {
					System.out.println("\n 28 Days in this Month");

				}

				break;

			default:
				System.out.println("\n Please enter Valid Number between 1 to 12");
		}
	}
}