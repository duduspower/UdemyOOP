package RotateMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class Help {
    public static void main(String[] args) {

        int [][] matrix = { {0,0,0,1,0,2,0,3,0,4},
                            {1,0,1,1,1,2,1,3,1,4},
                            {2,0,2,1,2,2,2,3,2,4},
                            {3,0,3,1,3,2,3,3,3,4},
                            {4,0,4,1,4,2,4,3,4,4}};

        Matrix matrixH = new Matrix();

        System.out.println("Program to Rotate 2D Array");
        System.out.println("\nInput Number to Rotate Matrix : ");

        System.out.println("(0) Oryginal Matrix");
        System.out.println("(1) Rotated 90  degrees Matrix");
        System.out.println("(2) Rotated 180 degrees Matrix");
        System.out.println("(3) Rotated 270 degrees Matrix");


        Scanner in = new Scanner(System.in);
        byte number = in.nextByte();

        switch (number){
            case 0:

                System.out.println("Oryginal Matrix : ");
                matrixH.printOrginalArray(matrix);

                break;

            case 1:

                System.out.println("\n\nRotated 90 degrees Matrix : ");
                matrixH.rotate90(matrix);

                break;

            case 2 :

                System.out.println("\n\nRotated 180 degrees Matrix : ");
                matrixH.rotate180(matrix);

                break;

            case 3 :

                System.out.println("\n\nRotated 270 degrees Matrix : ");
                matrixH.rotate270(matrix);

                break;

            default :

                System.out.println("Nubmer " + number + " isn't an option in program!");

                break;
        }
    }
}
