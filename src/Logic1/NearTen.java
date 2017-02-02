package Logic1;

/**
 * Created by vboliuk on 2/2/2017.
 */
public class NearTen {

    /**
     * Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b)
     * is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod
     *
     * nearTen(12) → true
     * nearTen(17) → false
     * nearTen(19) → true
     */
    public boolean nearTen(int num) {
        int a = num % 10;
        if((10 - (10-a)) <= 2 || (10 - a) <= 2) return true;
        return false;
    }
}
