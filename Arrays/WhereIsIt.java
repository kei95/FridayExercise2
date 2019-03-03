package Arrays;

import java.util.Arrays;
import java.util.Scanner;

import java.util.ArrayList;

public class WhereIsIt {
    public static void main(String[] args) {
        int num[];

        num = new int[]{2, 14, 35, 41, 31, 21, 14, 18, 49, 1};
        System.out.print("Array: ");
        for (int nums : num) System.out.print(nums + ", ");
        System.out.print("\n");

        Scanner in = new Scanner(System.in);
        System.out.print("Value to find: ");
        int un = in.nextInt();


        for (int i = 0; i < num.length; i++) {

            if (num[i] == un) {
                System.out.print(un + " is in slot " + i);
                break;
            } else if (i == num.length - 1) {
                System.out.print(un + " is not in slot ");
                break;
            }

        }
    }
}
