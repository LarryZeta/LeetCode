package definition;

import java.util.Random;

/**
 * Implementation the guess API @easy._374.GuessNumberHigherOrLower.
 */

public class GuessGame {

    int anInt;

    public GuessGame(int n) { this.anInt = new Random().nextInt(n); }

    public int guess(int num) {

        if (num > anInt) return 1;
        else if (num == anInt) return 0;
        else return -1;

    }

}
