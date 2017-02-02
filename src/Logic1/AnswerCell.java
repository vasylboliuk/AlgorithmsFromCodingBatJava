package Logic1;

/**
 * Created by vboliuk on 2/2/2017.
 */
public class AnswerCell {

    /**
     * Your cell phone rings. Return true if you should answer it. Normally you answer,
     * except in the morning you only answer if it is your mom calling.
     * In all cases, if you are asleep, you do not answer.
     *
     * answerCell(false, false, false) → true
     * answerCell(false, false, true) → false
     * answerCell(true, false, false) → false
     */
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isAsleep || (isMorning && !isMom)) return false;
        else if(isMorning && isMom) return true;
        else return true;
    }
}
