package DrawEmptyRectangle;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        helpClass helpClass = new helpClass();
        helpClass.getInfo();
        int height = helpClass.getHeight();
        int width = helpClass.getWidth();

        System.out.println("h : " + helpClass.getHeight());
        System.out.println("w : " + helpClass.getWidth());

        helpClass.rysuj(height, width);
    }
}

