import java.util.Random;

public class RandomNumbers {
    //int sum = 0;            //tworze zmienne ktore beda wystepowac w klasie
    int maxNum = 0;
    int minNum = 30;
    int result = 0;

    public int makeRandomResult() {   //metoda do tworzenia losowj liczby
        Random random = new Random();   //tworzymy obiekt random, bedzie mial jeden atrybut int max
        int result = random.nextInt(31);  //losujemy liczby w przedziale 0-30, 31 nie wchodzi
        this.result = result;
        return result;
    }
    public int getResult(){return result;}

    public int randomSumUpTo5000() {
        int max = 5000;   //przypisuje wartosc max = 5000
        int sum = 0;
        while (sum <= max)  {  //pętla się powtarza jesli suma wylosowanych mniejsza jak max
            int randomResult = makeRandomResult();
            sum = sum + randomResult;
        setMinNum(randomResult);
        setMaxNum(randomResult); } //dodajemy nowo wylosowana liczbe
        return sum;
    }
    public int setMinNum(int result) {

        if (result < minNum) {      //warunek by wyciągnac najmniejsza wylosowana liczbe
            minNum = result;
        }
        return minNum;
    }
    public int setMaxNum(int result) {
        if (result > maxNum) {  //max wartosc
            maxNum = result;
        }
        return maxNum;
    }
    public int getMinNum() {
        return minNum;
    }
    public int getMaxNum() {
        return maxNum;
    }

    public static void main(String[] args) {
        RandomNumbers numbers = new RandomNumbers();  //tworze obiekt numbers

        int resultSum = numbers.randomSumUpTo5000();            //
        System.out.println(resultSum);
        int resultNumber = numbers.getResult();            //
        System.out.println(resultNumber);
        int minNumber = numbers.getMinNum();            //
        System.out.println(minNumber);
        int maxNumber = numbers.getMaxNum();            //
        System.out.println(maxNumber);
    }
}