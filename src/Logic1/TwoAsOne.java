package Logic1;

/**
 * Created by vboliuk on 2/2/2017.
 */
public class TwoAsOne {

    /**
     * Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
     *
     * twoAsOne(1, 2, 3) → true
     * twoAsOne(3, 1, 2) → true
     * twoAsOne(3, 2, 2) → false
     */
    public boolean twoAsOne(int a, int b, int c) {
        int sumAB = a + b;
        int sumBC = b + c;
        int sumAC = a + c;
        if(sumAB==c || sumBC==a || sumAC==b) return true;
        return false;
    }
}
