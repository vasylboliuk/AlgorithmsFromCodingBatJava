package Logic2;

/**
 * Created by Dell on 2/2/2017.
 */
public class Blackjack {

    /**
     * Given 2 int values greater than 0, return whichever value is nearest to 21
     * without going over. Return 0 if they both go over.
     *
     * blackjack(19, 21) → 21
     * blackjack(21, 19) → 21
     * blackjack(19, 22) → 19
     * @param a
     * @param b
     * @return
     */
    public int blackjack(int a, int b) {
        int aNum = Math.abs(21-a);
        int bNum = Math.abs(21-b);
        if(a>21 && b>21) return 0;
        if(aNum>bNum && b<=21 || a>21) return b;
        else return a;
    }

}
