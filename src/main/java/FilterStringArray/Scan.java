package FilterStringArray;

import java.util.Scanner;

public class Scan {

    public String getString(){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj słowa oddzielone spacjami : ");
        return in.nextLine();
    }

    public int minimum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj minimalną długość wyrazu : ");
        return in.nextInt();
    }

}
