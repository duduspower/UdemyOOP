package FilterStringArray;

import java.util.ArrayList;
import java.util.Arrays;

public class Max {
    ArrayList<Character> charMatrix = new ArrayList<>();
    ArrayList<Character> charMatrix2 = new ArrayList<>();

    public String getMatrixOfWords(String[] strings){
        String maxString = "";
        for(int i = 0; i < strings.length; i++){
            if(strings[i].length() > maxString.length()){
                maxString = strings[i];
            }
        }
        return maxString;
    }
}
