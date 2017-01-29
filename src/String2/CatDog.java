package String2;

/**
 * Created by Dell on 1/29/2017.
 */
public class CatDog {

    /**
     * Return true if the string "cat" and "dog" appear the same number of times in the given string.
     *
     * catDog("catdog") → true
     * catDog("catcat") → false
     * catDog("1cat1cadodog") → true
     */
    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;
        /*for(int i=0; i<str.length()-1; i++){
        if(str.substring(i,i+3).contains("cat")) countCat++;
        if(str.substring(i,i+3).contains("dog")) countDog++;
        }*/
        countCat = str.length() - str.replace("cat", "").length();
        countDog = str.length() - str.replace("dog", "").length();

        if (countDog==countCat) return true;
        return false;
    }
}
