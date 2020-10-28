package com.jetbrains;

import java.util.Random;

public class Dice {

    public String Dice(){
        String txt = "terning ferdig";
        Random r = new Random();
        int sum = 0;

        while(sum != 7){
            int roll1 = r.nextInt(6) +1;
            int roll2 = r.nextInt(6)+ 1;
            sum = roll1 + roll2;
            System.out.println(roll1 + " + " + roll2 + " = " + sum);
        }
        return txt;
    }
}
