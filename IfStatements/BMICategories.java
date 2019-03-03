package IfStatements;

import java.util.Scanner;

public class BMICategories {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Your height in m: ");
        double height = in.nextDouble();

        System.out.print("Your weight in kg: ");
        double weight = in.nextDouble();

        double weightForBmi = weight * 0.45;
        double heightForBmi = height * 2;

        double bmi = weightForBmi / heightForBmi;

        String bmiCategory = "";

        if(bmi < 18.5){
            bmiCategory = "underweight";

        }
        else if (bmi < 18.5 && bmi <= 24.9) {
            bmiCategory = "normal weight";

        }
        else if (bmi >= 25.0 && bmi <= 29.0) {
            bmiCategory = "overweight";

        } else{
            bmiCategory = "obese";
        }

        System.out.println("Your BMI is " + bmi);
        System.out.println("BMI Category: " + bmiCategory);
    }
}
