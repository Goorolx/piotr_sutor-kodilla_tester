import java.util.Random;

public class RandomNumbersMk2 {
    int sum = 0;            //tworze zmienne ktore beda wystepowac w klasie
    int maxNum = 0;
    int minNum = 30;

    RandomNumbersMk2 (int minNum,int maxNum, int sum) {
        this.maxNum = maxNum;
        this.minNum = minNum;
        this.sum = sum;
    }
    public int makeRandomResult() {   //metoda do tworzenia losowj liczby
        Random random = new Random();   //tworzymy obiekt random, bedzie mial jeden atrybut int max
        int result = random.nextInt(31);  //losujemy liczby w przedziale 0-30, 31 nie wchodzi
        return result;
    }
    public RandomNumbersMk2 randomSumUpTo5000() {
        while (sum <= 5000) {  //pętla się powtarza jesli suma wylosowanych mniejsza jak max
            int randomResult = makeRandomResult();
            sum = sum + randomResult;

            if (randomResult < minNum) {      //warunek by wyciągnac najmniejsza wylosowana liczbe
                minNum = randomResult;
            }
            if (randomResult > maxNum) {  //max wartosc
                maxNum = randomResult;
            }}

            RandomNumbersMk2 minMaxSum = new RandomNumbersMk2(minNum, maxNum, sum);
            return minMaxSum;
        }
        public void show (){
            System.out.println(maxNum);
            System.out.println(minNum);
            System.out.println(sum);
        }

    public static void main(String[] args) {
        RandomNumbersMk2 numbers = new RandomNumbersMk2(0,0,0);  //tworze obiekt numbers
        numbers.randomSumUpTo5000();
        numbers.show();
    }
}