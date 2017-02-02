package Logic1;

/**
 * Created by vboliuk on 2/2/2017.
 */
public class LessBy10 {

    /**
     * Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
     *
     * lessBy10(1, 7, 11) → true
     * lessBy10(1, 7, 10) → false
     * lessBy10(11, 1, 7) → true
     */
    public boolean lessBy10(int a, int b, int c) {
        int high = Math.max(a,b);
        high = Math.max(high, c);
        if (high - a >= 10 || high - b >= 10 || high - c >=10) return true;
        return false;
    }
}
