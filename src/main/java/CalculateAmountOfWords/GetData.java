package CalculateAmountOfWords;

import java.util.Scanner;

public class GetData {
    public String getString(){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj tekst : ");
        String string = in.nextLine();
        return string;
    }
}
