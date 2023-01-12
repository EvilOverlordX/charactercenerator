package org.charactergenerator;

import org.diceroller.BasicDice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class Method2 {

    private final List<Integer> scores;
    private final BasicDice basicDice;

    public Method2() {
        scores = new LinkedList<>();
        basicDice = new BasicDice();
    }

    public Method2 rollScores() {
        for (int i = 0; i < 12; i++) {
            List<Integer> rolls = new LinkedList<>();
            for (int j = 0; j < 3; j++) {
                rolls.add(basicDice.d6());
            }
            scores.add(rolls.stream().reduce(0, Integer::sum));
        }
        scores.sort(Collections.reverseOrder());
        scores.subList(6, 12).clear();
        return this;
    }

    public List<Integer> getScores() {
        return scores;
    }

}
