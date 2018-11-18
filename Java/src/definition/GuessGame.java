package definition;

import java.util.Random;

/**
 * The guess API is defined in the parent class GuessGame.
 * @param_num, your guess
 * @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
 *     int guess(int num);
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
