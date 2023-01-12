package org.charactergenerator;

import org.diceroller.BasicDice;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public final class Method3 {

    private final List<Integer> scores;
    private final BasicDice basicDice;

    public Method3() {
        scores = new LinkedList<>();
        basicDice = new BasicDice();
    }

    public Method3 rollScores() {
        for (int i = 0; i < 6; i++) {
            List<Integer> attributeRolls = new LinkedList<>();
            for (int j = 0; j < 6; j++) {
                List<Integer> rolls = new LinkedList<>();
                for (int k = 0; k < 3; k++) {
                    rolls.add(basicDice.d6());
                }
                attributeRolls.add(rolls.stream().reduce(0, Integer::sum));
            }
            attributeRolls.sort(Collections.reverseOrder());
            scores.add(attributeRolls.get(0));
        }
        return this;
    }

    public List<Integer> getScores() {
        return scores;
    }
}
