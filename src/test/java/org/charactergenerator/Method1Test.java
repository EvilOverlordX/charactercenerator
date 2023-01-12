package org.charactergenerator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public final class Method1Test {

    private Method1 method1;

    @BeforeEach
    public void setup() {
        method1 = new Method1();
    }

    @Test
    public void getSixScoresTest() {
        assertThat(method1.rollScores().getScores())
                .asList()
                .as("Has six elements")
                .hasSize(6);
    }

    @Test
    public void sortedScoresTest() {
        assertThat(method1.rollScores().getScores())
                .asList()
                .as("Scores are sorted highest to lowest")
                .isSortedAccordingTo(Collections.reverseOrder());
    }
}
