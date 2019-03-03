package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class ThereOrNot {
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
        System.out.print("Value to find: ");
        int un = in.nextInt();

        for(int i = 0; i < num.size(); i++ ){
            if(un == num.get(i)){
                System.out.println( un + " is in the ArrayList.");
            } else if(i == num.size() - 1){
                System.out.println( un + " is not in the ArrayList.");
            }
        }
    }
}
