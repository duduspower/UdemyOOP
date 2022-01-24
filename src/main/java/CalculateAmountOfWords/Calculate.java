package CalculateAmountOfWords;

public class Calculate {
    public int getWordsAmount(String str){

    char[] ch = new char[str.length()];
    ch = str.toCharArray();
    int licznik = 0;
        for(int i = 0; i < str.length(); i++){
            if(ch[i] == ' '){
                licznik++;
            }
        }

        return licznik;
    }

}
