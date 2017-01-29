package String1;

/**
 * Created by Dell on 1/29/2017.
 */
public class MakeOutWord {

    /**
     * Given an "out" string length 4, such as "<<>>", and a word, return a new string where
     * the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j)
     * to extract the String starting at index i and going up to but not including index j.
     * makeOutWord("<<>>", "Yay") → "<<Yay>>"
     * makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
     * makeOutWord("[[]]", "word") → "[[word]]"
     */
    public String makeOutWord(String out, String word) {
        String sub1 = out.substring(0, 2);
        String sub2 = out.substring(2, 4);
        return sub1+word+sub2;

    }

}
