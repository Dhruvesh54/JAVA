/*8) Create a java program to find GCD and LCM of given 
numbers.*/

import java.util.*;

class t1_8 {
    public static void main(String[] args) {
        int a, b, t, gcd, lcm, aTemp, bTemp;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the first number :");
        a = ob.nextInt();
        System.out.println("Enter the second number :");
        b = ob.nextInt();
        aTemp = a;
        bTemp = b;
        while (bTemp != 0) {
            t = bTemp;
            bTemp = aTemp % bTemp;
            aTemp = t;
        }

        gcd = aTemp;
        lcm = (a * b) / gcd;
        System.out.println("GCD=" + gcd);
        System.out.println("LCM=" + lcm);
    }
}
