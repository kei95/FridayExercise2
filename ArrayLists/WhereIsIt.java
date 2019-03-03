package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class WhereIsIt {
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
            int count = 0;
            if(un == num.get(i)){
                System.out.println( un + "  is in slot " + i + ".");
                count++;
            } else if(i == num.size() - 1 && count != 0) {
                System.out.println(un + " is not in the ArrayList.");
            }
        }
    }
}

