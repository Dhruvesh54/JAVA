/*14) Write a java program that takes two integer numbers, find 
factorial of both these numbers and multiply it.*/

import java.util.*;

class t1_14 {
    public static void main(String[] args) {
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of num ");
        int num = sc.nextInt();
        int factorial2 = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("factorial of first variable is = " + factorial);
        System.out.println("Enter value of num2 ");
        int num2 = sc.nextInt();
        for (int i = 1; i <= num2; i++)
            factorial2 *= i;
        System.out.println("factorial of second variable is " + factorial2);
        int result = factorial * factorial2;
        System.out.println("Multiplication of two variables factorial is : " + result);
    }

}