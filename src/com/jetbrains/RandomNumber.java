package com.jetbrains;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public Object RandomNumber(){
        System.out.println("This program picks numbers from \n" +
                "1 to 10 until a particular\n" +
                "number comes up");
        System.out.println();

        Scanner console = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Pick a number between 1 and 10-->");
        int number = console.nextInt();
        String endTxt = "Finish";
        int result = -1;
        int count = 0;
        while(result != number){
            result = r.nextInt(10) + 1;
            System.out.println("next number = " + result);
            count++;
        }
        System.out.println("Your number came up after " + count + " times");
        return endTxt;
    }

}
