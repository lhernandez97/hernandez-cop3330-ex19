/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //prompt the user for their height (in inches)
        System.out.print("What is your height (in inches)? ");
        float height = in.nextInt();
        //prompt the user for their weight (in pounds)
        System.out.print("What is your weight (in pounds)? ");
        float weight = in.nextInt();
        //now calculate the BMI of the user
        double bmi = (weight / (height * height)) * 703;
        //tell the user their BMI
        System.out.printf("Your BMI is %.1f%n", bmi);
        //check to see if the user is overweight, underweight, or normal
        if(bmi >= 18.5 && bmi <= 25) {
            System.out.print("You are within the ideal weight range.");
        }
        else if(bmi < 18.5) {
            System.out.print("You are underweight. You should see your doctor.");
        } else {
            System.out.print("You are overweight. You should see your doctor.");
        }
    }
}
