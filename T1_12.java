/*12) Write a java program that counts how many 
numbers are bigger than given number.*/

import java.util.*;

class t1_12 {
    public static void main(String[] args) {
        int number;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter array elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter number ");
        number = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > number)
                count++;
        }
        System.out.print("Count = " + count);

    }
}