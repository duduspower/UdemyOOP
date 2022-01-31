package ExtendArray;

public class Program {
    public static void main(String[] args) {
        Array1 array1 = new Array1();
        array1.make();
        Array2 array2 = new Array2();
        array2.makeSecondArray(array1.getArray());
    }
}
