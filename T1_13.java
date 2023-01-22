
/*13) Write a java program that count specific number from the 
given numbers.*/
import java.util.*;

class t1_13 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int number;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements");
        for (int i = 0; i < array.length; i++)
            array[i] = sc.nextInt();
        System.out.println("Enter the number you want to count ");
        number = sc.nextInt();
        for (int i = 0; i < array.length; i++)
            if (array[i] == number)
                count++;
        System.out.println("number selected " + number + " and number count = " + count);
    }
}