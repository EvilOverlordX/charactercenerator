package org.charactergenerator;

import org.diceroller.BasicDice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class Method1 {

    private final List<Integer> scores;
    private final BasicDice basicDice;

    public Method1() {
        scores = new LinkedList<>();
        basicDice = new BasicDice();
    }

    public Method1 rollScores() {
        for (int i = 0; i < 6; i++) {
            List<Integer> rolls = new LinkedList<>();
            for (int j = 0; j < 4; j++) {
                rolls.add(basicDice.d6());
            }
            rolls.sort(Collections.reverseOrder());
            rolls.remove(3);
            scores.add(rolls.stream().reduce(0, Integer::sum));
        }
        scores.sort(Collections.reverseOrder());
        return this;
    }

    public List<Integer> getScores() {
        return scores;
    }

}
