package MaxIntInArray;

import java.util.Scanner;

public class Array {

    private String str = "";
//    private final String str = "10 20 30 25 15";

    String[] stringArray = new String[20];
    int[] intArray = new int[20];

    public void convertToArray() {
        stringArray = str.split(" ");

        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
    }

    public int maxValue() {
        int max = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (max != 0) {
                if (max < intArray[i]) {
                    max = intArray[i];
                }
            } else {
                max = intArray[0];
            }
        }
        return max;
    }

    public void giveInfo() {
        System.out.println("String : " + str);

        System.out.println("String Array : ");
        for (int j = 0; j < stringArray.length; j++) {
            System.out.println(stringArray[j]);
        }

        System.out.println("Integer Array : ");
        for (int k = 0; k < intArray.length; k++) {
            if(intArray[k] != 0) {
                System.out.println(intArray[k]);
            }
        }

        System.out.println("Max Value of given array is : " + maxValue());
    }

    public void getString(){
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj ciąg liczb oddzielonych spacjami : ");
        str = in.nextLine();
    }

}
