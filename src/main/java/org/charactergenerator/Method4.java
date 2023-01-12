package org.charactergenerator;

import org.diceroller.BasicDice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class Method4 {

    private final List<List<Integer>> scores;
    private final BasicDice basicDice;

    public Method4() {
        scores = new LinkedList<>();
        basicDice = new BasicDice();
    }

    public Method4 rollScores() {
        for (int i = 0; i < 12; i++) {
            List<Integer> attributeRolls = new LinkedList<>();
            for (int j = 0; j < 6; j++) {
                List<Integer> rolls = new LinkedList<>();
                for (int k = 0; k < 3; k++) {
                    rolls.add(basicDice.d6());
                }
                attributeRolls.add(rolls.stream().reduce(0, Integer::sum));
            }
            scores.add(attributeRolls);
        }
        return this;
    }

    public List<List<Integer>> getScores() {
        return scores;
    }
}
