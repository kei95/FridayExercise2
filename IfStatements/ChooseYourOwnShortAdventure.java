package IfStatements;

import java.util.Scanner;

public class ChooseYourOwnShortAdventure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");

        System.out.println("There're doors, wich one do you wanna get in?");
        System.out.print("1: left, 2: right ");
        int choice1 = in.nextInt();

            if (choice1 == 1){ //Rightcase
                System.out.println("You see a little boy in side the room and he says " + "follow me!");
                System.out.println("Do you wanna follow him?");
                System.out.print("1: Yes, 2: No");
                int choice2 = in.nextInt();

                    if(choice2 == 1){ //second
                        System.out.println("The boy is disappeared when you and him face a door \n and you can hear boy's voice from inside" + "Come in!");
                        System.out.println("Do you wanna get in?");
                        System.out.print("1: Yes, 2: No");
                        int choice4 = in.nextInt();

                        if(choice4 == 1){ // third
                            System.out.println("Boy was waiting for you inside the room and there're lot of foods and they look so good. \n The boy asks you let's eat together");
                            System.out.println("Do you wanna eat them?");
                            System.out.print("1: Yes, 2: No");
                            int choice8 = in.nextInt();

                                if(choice8 == 1){ //ED1
                                    System.out.println("All of sodden, You fell in asleep. \n When you wake up, you were in your house but there was a latter next to the pillow and it said THANK YOU MAM!");

                                } else { // ED2
                                    System.out.println("All of sodden, You fell in asleep. \n When you wake up, you were in your house.");
                                }


                        } else {
                            System.out.println("When you were about to turn back, you found a lot of foods and they look so good.");
                            System.out.println("Do you wanna eat them?");
                            System.out.print("1: Yes, 2: No");
                            int choice10 = in.nextInt();

                            if(choice10 == 1){ //ED3
                                System.out.println("All of sodden, You fell in asleep. \n When you wake up, you were in your house but there was a latter next to the pillow and it said YOU EAT MY DINNER!");

                            } else { // ED4
                                System.out.println("All of sodden, You fell in asleep. \n When you wake up, you were in your house.");
                            }

                        }

                    } else { //second
                        System.out.println("You find a door again and you can hear boy's voice from inside" + "Come in!");
                        System.out.println("Do you wanna get in?");
                        System.out.print("1: Yes, 2: No");
                        int choice6 = in.nextInt();

                        if(choice6 == 1){
                            System.out.println("Boy was waiting for you inside of the room, and boy says let's play together!");
                            System.out.println("Do you wanna play with him?");
                            System.out.print("1: Yes, 2: No");
                            int choice11 = in.nextInt();

                            if (choice11 == 1) {//ED 5
                                System.out.println("All of sodden, You fell in asleep. \n When you wake up, you were in your house but there was a latter next to the pillow and it said THANK YOU MAM!");

                            } else {//ED6
                                System.out.println("All of sodden, You fell in asleep. \n When you wake up, you were in your house.");

                            }

                        } else{
                            System.out.println("Of couse, you got lost");
                            System.out.println("Do you wanna go back the way you come?");
                            System.out.print("1: Yes, 2: No");
                            int choice12 = in.nextInt();

                            if(choice12 == 0){//ED 7
                                System.out.println("You finally found a way to go home, but you didn't feel right going home...");

                            } else {//ED8
                                System.out.println("All of sodden, You fell in asleep. but you never woke up...");



                            }

                        }
                    }



            }
            else { //Leftcase
                System.out.println("You see a old woman in side the room and she says " + "follow me my dear");
                System.out.println("Do you wanna follow her?");
                System.out.print("1: Yes, 2: No");
                int choice3 = in.nextInt();

                    if(choice3 == 1){ //second
                        System.out.println("The old woman is disappeared when you and her face a door \n and you can hear her voice from inside" + "Come in");
                        System.out.println("Do you wanna get in?");
                        System.out.print("1: Yes, 2: No");
                        int choice5 = in.nextInt();

                        if(choice5 == 1){ // third
                            System.out.println("Old woman was waiting for you inside the room and there're lot of foods and they look so good. \n She asks you let's eat together");
                            System.out.println("Do you wanna eat them?");
                            System.out.print("1: Yes, 2: No");
                            int choice9 = in.nextInt();

                                if(choice9 == 1){ //ED5
                                    System.out.println("All of sodden, You fell in asleep. \n When you wake up, you were in your house but there was a latter next to the pillow and it said THANK YOU MY DEAR");

                                } else { // ED6
                                    System.out.println("All of sodden, You fell in asleep. \n When you wake up, you recognized your were on your may home form your grand mother's grave.");
                                }
                            }

                    } else { //second
                        System.out.println("You find a door again and you can hear boy's voice from inside" + "Did you want to Come in?");
                        System.out.println("Do you wanna get in?");
                        System.out.print("1: Yes, 2: No");
                        int choice7 = in.nextInt();

                        if(choice7 == 1){
                            System.out.println("The old woman was waiting for you inside of the room, and boy says let's talk together my dear");
                            System.out.println("Do you wanna talk with him?");
                            System.out.print("1: Yes, 2: No");
                            int choice13 = in.nextInt();

                            if (choice13 == 1) {//ED 9
                                System.out.println("All of sodden, You fell in asleep. \n When you wake up, you recognized your were on your may home form your grand mother's grave.");

                            } else {//ED10
                                System.out.println("All of sodden, You fell in asleep. \n When you wake up, you were in your house.");

                            }

                        } else{
                            System.out.println("Of couse, you got lost");
                            System.out.println("Do you wanna go back the way you come?");
                            System.out.print("1: Yes, 2: No");
                            int choice12 = in.nextInt();

                            if(choice12 == 0){//ED 7
                                System.out.println("You finally found a way to go home, but you didn't feel right going home...");

                            } else {//ED8
                                System.out.println("All of sodden, You fell in asleep. but you never woke up...");

                            }
                    }
            }



        }

}
}
