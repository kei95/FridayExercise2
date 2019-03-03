package Arrays;

import java.util.Scanner;

public class IsItThereOrNot {
    public static void main(String[] args) {
        int num[];

        num = new int[]{24, 41, 36, 12, 7, 2, 26, 16, 31, 49};
        System.out.print("Array: " );
        for(int nums : num)System.out.print(nums + ", ");
        System.out.print("\n");

        Scanner in = new Scanner(System.in);
        System.out.print("Value to find: ");
        int un = in.nextInt();


        for(int i =0; i < num.length; i++){
            if(num[i] == un){
                System.out.print( un +  " is in the array.");
                break;
            } else if (i == num.length - 1) {
                System.out.print(un + " is not in the array.");
                break;
            }

        }


    }
}
