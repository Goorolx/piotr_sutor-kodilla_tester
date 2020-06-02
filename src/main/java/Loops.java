import java.util.Random;

public class Loops {
    public static void main (String[] args) {

        String[] names = new String[] {"Ola","Ala","Zyta"};
        int namesLength = names.length;

        for (int i=0;i<namesLength;i++)   //deklarujemy ile razy wykonamy petle
        {
            System.out.println(names[i]);
        }
        for (int i=namesLength-1 ; i>=0 ; i-- )
        {
            System.out.println(names[i]);
        }
        int[] numbers = new int[] {1,2,3,4,5};
        int numLength = numbers.length;
        int numSum = 0;
        for (int i=0;i<numLength;i++)
        {
            numSum = numSum + numbers[i];
                        //System.out.println(numSum);
        }
        System.out.println("Suma wartości tablicy = "+ numSum);

        int i = 0;
        while (i <= 10) {               //sprawdzamy czy warunek jest spelniany, jesli nie kręcimy dalej
            System.out.println(i);
            i++;
        }



    }
}
