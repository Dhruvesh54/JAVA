/*15) Write a java program to make conversion from Binary to 
Decimal.*/

import java.util.*;

class t1_15 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter The Binary Number");
        int n = ob.nextInt();
        int d = 0;
        int a = 0;
        while (n != 0) {
            int temp = n % 10;
            d += temp * Math.pow(2, a);
            n = n / 10;
            a++;
        }
        System.out.println("desimel number is:" + d);
    }
}
