package Arrays;

import java.util.Scanner;

public class FindingValueInArray {
    public static void main(String[] args) {
        int num[];

        System.out.print("Array: ");

        num = new int[] {21, 23, 45, 39, 11, 40, 38, 14, 42, 50};
        for (int nums: num ){
            System.out.print(nums + ", ");
        }
        System.out.print("\n");

        Scanner in = new Scanner(System.in);
        System.out.print("Value to find: ");
        int un = in.nextInt();

        for (int i = 0; i < num.length; i++) {
            if(num[i] == un){
                System.out.print(un + " is in the array.");
                    break;
                } else if(i == num.length - 1){
                System.out.print("it's not the number");
                    break;
                }
            }

        }
    }