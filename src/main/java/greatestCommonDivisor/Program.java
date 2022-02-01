package greatestCommonDivisor;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.scanNumber();

        int a = numbers.getA();
        int b = numbers.getB();

        najwiekszyDzielnik(a, b);

    }

    public static int najwiekszyDzielnik(int a, int b){
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();

        for(int i = 1; i < a; i++){
            if(a % i == 0){
                arrayList1.add(i);
            }
        }

        for(int j = 1; j < b; j++){
            if(a % j == 0){
                arrayList2.add(j);
            }
        }

        int size = 0;

        if(arrayList1.size() > arrayList2.size()){
            size = arrayList2.size();
        }
        else{
            size = arrayList1.size();
        }

        for(int k = 0; k < size; k++){
            if(arrayList1.contains(arrayList2.get(k))){
                arrayList3.add(arrayList2.get(k));
            }
        }

        System.out.println("\n\nArrayList 3 : ");

        for(int h = 0; h < arrayList3.size(); h++){
            System.out.println(arrayList3.get(h));
        }

        int dzielnik = arrayList3.get(arrayList3.size() -1);
        System.out.println("Największy Wspólny Dzielnik : " + dzielnik);

        return dzielnik;
    }
}
