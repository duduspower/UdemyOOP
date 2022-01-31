package ExtendArray;

public class Array2 {
    Array1 array1 = new Array1();

    int[] array = new int[array1.length()];

    public int[] makeSecondArray(int[] array){
        for(int i = 0; i < array.length; i++){
            this.array[i] = array[i];
            this.array[i + array.length] = array[i] * 2;
        }
        return this.array;
    }
}
