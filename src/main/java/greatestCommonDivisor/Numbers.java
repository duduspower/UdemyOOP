package greatestCommonDivisor;

import java.util.Scanner;

public class Numbers {

    private int a;
    private int b;
    public void scanNumber(){

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj 2 liczby oddzielone spacją : ");
        String str = in.nextLine();

        String[] strings = str.split(" ");

        a = Integer.parseInt(strings[0]);
        b = Integer.parseInt(strings[1]);

        System.out.println("A : " + a);
        System.out.println("B : " + b);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
