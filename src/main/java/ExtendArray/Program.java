package ExtendArray;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give Length of Array");
        int number = in.nextInt();

        Array1 array1 = new Array1();
        array1.setLength(number);
        int[] arrayA = array1.makeArray();
        System.out.println(Arrays.toString(arrayA));

        Array2 array2 = new Array2();
        array2.setLength(number * 2);
        int[] arrayB = array2.makeArray(arrayA);
        System.out.println(Arrays.toString(arrayB));

    }
}
