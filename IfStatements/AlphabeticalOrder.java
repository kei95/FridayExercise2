package IfStatements;

import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What's your last name? ");
        String name = in.next();

        if (0 > name.compareTo("Carswel")) {
            System.out.print("you don't have to wait long, " + name + ".");

        } else if (0 < name.compareTo("Jones") && 0 > name.compareTo("Smith")) {
            System.out.print("that's not bad " + name + ".");

        } else if (0 < name.compareTo("Smith") && 0 > name.compareTo("Young")){
            System.out.print("it's gonna be a while " + name + ".");

        } else if (0 < name.compareTo("Young")){
            System.out.print("not going anywhere for a while?");

        }
    }
}
