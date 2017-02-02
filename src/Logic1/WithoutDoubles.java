package Logic1;

/**
 * Created by vboliuk on 2/2/2017.
 */
public class WithoutDoubles {

    /**
     * Return the sum of two 6-sided dice rolls, each in the range 1..6.
     * However, if noDoubles is true, if the two dice show the same value,
     * increment one die to the next value, wrapping around to 1 if its value was 6.
     *
     * withoutDoubles(2, 3, true) → 5
     * withoutDoubles(3, 3, true) → 7
     * withoutDoubles(3, 3, false) → 6
     */
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        int sum = die1 + die2;
        if((noDoubles && die1!=die2) || (!noDoubles && die1!=die2)) return sum;
        else if(noDoubles && die1==die2 && die1!=6) return sum+1;
        else if(!noDoubles && die1==die2) return sum;
        else return 7;
    }

}
