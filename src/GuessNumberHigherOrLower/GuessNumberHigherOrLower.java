package GuessNumberHigherOrLower;
/** Guess Number Higher or Lower
 * We are playing the Guess Game. The game is as follows:
 *
 * I pick a number from 1 to n. You have to guess which number I picked.
 *
 * Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
 *
 * You call a pre-defined API int guess(int num), which returns three possible results:
 *
 * -1: Your guess is higher than the number I picked (i.e. num > pick).
 * 1: Your guess is lower than the number I picked (i.e. num < pick).
 * 0: your guess is equal to the number I picked (i.e. num == pick).
 * Return the number that I picked.
 */
public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int start = 0;
        int end = n;
        while(start < end) {
            int middle = start + (end - start) / 2;
            switch (guess(middle)) {
                case -1: {
                    end = middle - 1;
                    break;
                }
                case 1: {
                    start = middle + 1;
                    break;
                }
                default: {
                    return middle;
                }
            }
        }
        return end;
    }

    private int guess(int n) {
        return 0;
    }
}
