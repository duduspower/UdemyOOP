package ExtendArray;

public class Array2 {

        private int length;

        public void setLength(int number){
            this.length = number;
        }

        public int[] makeArray(int[] oldArray){
            int[] array = new int [length];

            double temp;

            for(int i = 0; i < oldArray.length; i++){
                array[i] = oldArray[i];
            }
            for(int i = 0; i < oldArray.length; i++){
                array[i + oldArray.length] = oldArray[i] * 2;
            }

            return array;
        }
}

