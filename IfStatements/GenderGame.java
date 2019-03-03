package IfStatements;

import java.util.Scanner;

public class GenderGame {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("What is your gender (1(male or 2(female)): ");
        int gender = in.nextInt();

        System.out.print("First name: ");
        String firstName = in.next();

        System.out.print("Last name: ");
        String lastName = in.next();

        System.out.print("Age: ");
        int age = in.nextInt();

        System.out.print("Are you married, " + firstName + " 1(yes) or 2(no)? ");
        int marrige = in.nextInt();

        if(marrige == 1 && gender == 2){
            System.out.print("Then I shall call you Mrs. " + lastName + ".");
        }
        else if(marrige == 2 && gender == 2){
            System.out.print("Then I shall call you Ms. " + lastName + ".");
        }
        else if(gender == 1){
            System.out.print("Then I shall call you Mr. " + lastName + ".");
        }
        else if (age < 20) System.out.print("Then I shall call you "+ firstName + lastName + " .");
    }
}
