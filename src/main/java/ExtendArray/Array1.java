package ExtendArray;

import java.util.Scanner;

public class Array1 {

    private int length;

    public void setLength(int number){
        this.length = number;
    }

    public int[] makeArray(){
        int[] array = new int [length];

        double temp;

        for(int i = 0; i < array.length; i++){
            temp = Math.random();
            temp = temp * 10;

            array[i] = (int)temp;
        }

        return array;
    }
}
