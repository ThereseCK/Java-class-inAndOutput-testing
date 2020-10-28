package com.jetbrains;

import java.util.Random;
import java.util.Scanner;

import static com.jetbrains.getBMI.giveIntro;
import static com.jetbrains.getBMI.reportResults;

public class Main {

    public static void main(String[] args) {
        /*
        //Dette hører til Square
        var SquareCheck = new Square(7);
        System.out.println(SquareCheck.GetArea());
        */


        //Dette hører til BMI
        giveIntro();

        Scanner console = new Scanner(System.in);
        double bmi1 = getBMI.getBMI(console);
        double bmi2 = getBMI.getBMI(console);
        reportResults(bmi1, bmi2);


        /*
        //dette hører til number delt på 2
        Scanner console = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = console.nextInt();
        while(number >0){
            number = number / 2;
            System.out.println(number);
        }
         */

        // velger ett random tall og teller hvor mange ganger det tar før ditt tall matcher med random nummer
      var number = new RandomNumber();
      System.out.println(number.RandomNumber());

      //randomDices
        var randomDices = new Dice();
        System.out.println(randomDices.Dice());

        var rainbow = new Colors(9);
        System.out.println(rainbow.colorsInRainbow());
        var rainbow2 = new Colors(7);
        System.out.println(rainbow2.colorsInRainbow());
    }



}
