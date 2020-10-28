package com.jetbrains;

public class Colors {
   private int _number;

    public Colors(int number) {
        _number = number;
    }

    public char colorsInRainbow(){

        if (_number == 1){
            System.out.println(_number + " is the Violet Color in the rainbow" );
        }
        if (_number == 2){
            System.out.println(_number + " is the Indigo Color in the rainbow" );
        }
        if (_number == 3){
            System.out.println(_number + " is the Blue Color in the rainbow" );
        }
        if (_number == 4){
            System.out.println(_number + " is the Green Color in the rainbow" );
        }
        if (_number == 5){
            System.out.println(_number + " is the Yellow Color in the rainbow" );
        }
        if (_number == 6){
            System.out.println(_number + " is the Orange Color in the rainbow" );
        }
        if (_number == 7){
            System.out.println(_number + " is the Red Color in the rainbow" );
        }
        if (_number > 7){
            System.out.println(_number + " is not a valid number" );
        }

        return 0;
    }
}
