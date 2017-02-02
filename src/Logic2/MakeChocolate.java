package Logic2;

/**
 * Created by Dell on 2/2/2017.
 */
public class MakeChocolate {

    /**
     * We want make a package of goal kilos of chocolate.
     * We have small bars (1 kilo each) and big bars (5 kilos each).
     * Return the number of small bars to use, assuming we always use big bars before
     * small bars. Return -1 if it can't be done.
     *
     * makeChocolate(4, 1, 9) → 4
     * makeChocolate(4, 1, 10) → -1
     * makeChocolate(4, 1, 7) → 2
     * @param small
     * @param big
     * @param goal
     * @return
     */
    public int makeChocolate(int small, int big, int goal) {
        int BIG_BARS = 5;
        big = big* BIG_BARS;
        int modeBig = goal%BIG_BARS;

        if (big + small < goal || small < modeBig)
            return -1;

        small = goal - big;
        if(small < 0){
            return (big+small)%BIG_BARS;
        }else return small;
    }

}
