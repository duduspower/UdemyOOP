package CalculateAmountOfWords;

public class Words {
    public static void main(String[] args) {
        GetData getData = new GetData();
        Calculate calculate = new Calculate();

        System.out.println(calculate.getWordsAmount(getData.getString()));
    }
}
