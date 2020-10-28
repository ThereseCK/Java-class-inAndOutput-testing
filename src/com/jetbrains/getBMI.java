package com.jetbrains;

import java.util.Scanner;

public class getBMI {

    public static double getBMI(Scanner console){
        System.out.println("Enter Person's information: ");
        System.out.print("height in CM ?");
        double height = console.nextDouble();
        System.out.println("weight in KG ?");
        double weight = console.nextDouble();
        double bmi = BMIFor(height, weight);
        System.out.println();
        return bmi;
    }

    public static void giveIntro(){
        System.out.println("This program reads data for two");
        System.out.println("people and computes their body");
        System.out.println("mass index and weight status");
        System.out.println();
    }

    public static double BMIFor(double heightCm, double weight) {
        var heightM = heightCm/100;
        return weight / (heightM * heightM);
    }

    public static void reportResults(double bmi1, double bmi2){
        System.out.printf("Person #1 body mass index = %5.2f\n", bmi1);
        System.out.printf(reportStatus(bmi1));
        System.out.printf("Person #2 body mass index = %5.2f\n", bmi2);
        System.out.printf(reportStatus(bmi2));
    }

    public static String reportStatus(double bmi) {
        if(bmi < 18.5){
            return "Underweight";
        } else if (bmi < 25){
            return "Normal";
        } else if(bmi < 30){
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
