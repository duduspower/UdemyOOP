package FilterStringArray;

import java.util.ArrayList;
import java.util.Arrays;

public class Filter {
    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<>();

        Scan scan = new Scan();
        Max max = new Max();

        String str = scan.getString();
        int min = scan.minimum();

        String[] string = str.split(" ");

        System.out.println("Słowa po filtracji : ");

        for(int i = 0; i < string.length; i++){
            if(string[i].length() > min - 1){
                System.out.println(string[i]);
            }
        }
        System.out.println("Najdłuższe słowo z podanych to : " + max.getMatrixOfWords(string));
    }
}
