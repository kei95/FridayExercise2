package Arrays;

import java.util.Scanner;

public class LocatingTheLargestValue {
    public static void main(String[] args) {

        int[] num = new int[]{12, 45, 75, 2, 54, 23, 97, 43, 100, 57};
        int big = 0;
        int bigIn = 0;
        for(int i = 0; num.length > i; i++){
            if(num[i] > big){
                big = num[i];
                bigIn = i;
            }
        }
        System.out.println("The largest value is " + big);
        System.out.println("It is in slot " + bigIn);
    }
}
