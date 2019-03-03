package Arrays;

import java.util.Scanner;

public class HowManyTimes {
    public static void main(String[] args) {
        int num[];

        num = new int[]{33, 32, 45, 33, 12, 54, 12, 33, 1, 5,};
        System.out.print("Array :");
        for(int nums : num){
            System.out.print(nums + ", ");
        }

        System.out.print("\n");

        Scanner in = new Scanner(System.in);
        System.out.print("Value to find: ");
        int un = in.nextInt();

        int count = 0;
        for(int i =0; i < num.length; i++){
            if(num[i] == un){
                count += 1;
            }
        }
        System.out.print(un + " was found " + count + " times.");
    }
}
