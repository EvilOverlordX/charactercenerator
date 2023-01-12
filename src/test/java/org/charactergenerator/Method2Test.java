package org.charactergenerator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public final class Method2Test {

    private Method2 method2;

    @BeforeEach
    public void setup() {
        method2 = new Method2();
    }

    @Test
    public void getSixScoresTest() {
        assertThat(method2.rollScores().getScores())
                .asList()
                .as("Has six elements")
                .hasSize(6);
    }

    @Test
    public void sortedScoresTest() {
        assertThat(method2.rollScores().getScores())
                .asList()
                .as("Scores are sorted highest to lowest")
                .isSortedAccordingTo(Collections.reverseOrder());
    }
}
