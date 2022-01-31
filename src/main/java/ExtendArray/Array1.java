package ExtendArray;

import java.util.Scanner;

public class Array1 {
    Scanner in = new Scanner(System.in);

    private int arrayLength = getLenght();
    private int array[] = new int[arrayLength];

    public byte getLenght(){
        System.out.println("Give Array Lenght : ");
        byte number = in.nextByte();

        return number;
    }

    public void setValues(int[] array){
        for(int i = 0; i < array.length; i++){
            double temp = Math.random();
            temp = temp * 10;
            array[i] = (int) temp;
        }
    }

    public void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public int[] getArray(){
        return array;
    }

    public int length(){
        return arrayLength;
    }

    public void make(){
        setValues(array);
        printArray(array);
    }
}
