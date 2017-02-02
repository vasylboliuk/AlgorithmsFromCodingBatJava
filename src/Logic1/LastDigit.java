package Logic1;

/**
 * Created by vboliuk on 2/2/2017.
 */
public class LastDigit {

    /**
     *  Given three ints, a b c, return true if two or more of them have the same rightmost digit.
     *  The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
     *
     *  lastDigit(23, 19, 13) → true
     *  lastDigit(23, 19, 12) → false
     *  lastDigit(23, 19, 3) → true
     */
    public boolean lastDigit(int a, int b, int c) {
        int aMode = a%10;
        int bMode = b%10;
        int cMode = c%10;
        if(aMode==bMode || aMode==cMode || bMode==cMode) return true;
        return false;
    }
}
