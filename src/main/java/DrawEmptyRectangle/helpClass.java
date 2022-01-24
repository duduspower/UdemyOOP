package DrawEmptyRectangle;

import java.util.Scanner;

public class helpClass {
    private int height;
    private int width;

    public void getInfo() {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj wysokość prostokąta : ");
        height = in.nextInt();

        System.out.println("Podaj szerokość prostokąta : ");
        width = in.nextInt();

    }

    public void rysuj(int h, int w) {
        for (int i = 0; i < h; i++) {
            System.out.println("");
            for (int j = 0; j < w; j++) {
                System.out.print("* ");
            }
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
