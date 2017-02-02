package Logic1;

/**
 * Created by vboliuk on 2/2/2017.
 */
public class SumLimit {

    /**
     * Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a.
     * If the sum has more digits than a, just return a without b. (Note: one way to compute the
     * number of digits of a non-negative int n is to convert it to a string with
     * String.valueOf(n) and then check the length of the string.)
     *
     * sumLimit(2, 3) → 5
     * sumLimit(8, 3) → 8
     * sumLimit(8, 1) → 9
     */
    public int sumLimit(int a, int b) {
        int sum = a+b;
        int lenSum = String.valueOf(sum).length();
        int lenA = String.valueOf(a).length();
        if(lenSum==lenA) return sum;
        else return a;
    }
}
