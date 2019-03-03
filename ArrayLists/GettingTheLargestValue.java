package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class GettingTheLargestValue {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(13);
        num.add(64);
        num.add(75);
        num.add(86);
        num.add(13);
        num.add(64);
        num.add(75);
        num.add(86);
        num.add(13);
        num.add(64);
        System.out.println("ArrayList: " + num);

        Scanner in = new Scanner(System.in);

        int big = num.get(0);
        for(int i = 0; i < num.size(); i++ ){

            if(big < num.get(i)){
                big = num.get(i);
            }
        }
        System.out.println("The largest value is " + big);
    }
}
