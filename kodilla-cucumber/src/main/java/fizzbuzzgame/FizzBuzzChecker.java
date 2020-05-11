package fizzbuzzgame;

public class FizzBuzzChecker {

    public String fizzBuzzCheck(int number){
        int m3 = number%3;
        int m5 = number%5;
        System.out.println(m3+"  "+m5);
        if (m5==0 & m3==0){
            return "FizzBuzz";
        }
        else if (m5==0){
            return "Buzz";
        }
        else if (m3==0){
            return "Fizz";
        }
        else{
            return "None";
        }

    }
}
