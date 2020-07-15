package Random;

import java.util.Random;

public class CoinToss {

    public String tossACoin() {
        Random random = new Random();
        int toss = Math.abs(random.nextInt()) % 2;
        if (toss == 0) {
            return "Orzel";
        } else
            return "Reszka";
    }

    public static void main(String[] args) {
        CoinToss game = new CoinToss();
        for (int i = 0; i < 6; i++) {
            System.out.println(game.tossACoin());

        }

    }
}
