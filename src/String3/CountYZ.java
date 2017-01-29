package String3;

/**
 * Created by Dell on 1/29/2017.
 */
public class CountYZ {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy"
     * and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
     * We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     *
     * countYZ("fez day") → 2
     * countYZ("day fez") → 2
     * countYZ("day fyyyz") → 2
     */
    public int countYZ(String str) {
        String[] list = str.split("[^a-zA-Z]+");
        int count = 0;
        for(String s : list){
            String s2 = s.toLowerCase();
            char[] listChars = s2.toCharArray();
            if(s2 != null && !s2.isEmpty() && ((s2.substring(s.length()-1).equals("z") || s2.substring(s.length() - 1).equals("y")))){
                count++;
            }
        }
        return count;
    }
}
