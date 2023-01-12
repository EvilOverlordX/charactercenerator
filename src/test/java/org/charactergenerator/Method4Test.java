package org.charactergenerator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class Method4Test {

    private Method4 method4;

    @BeforeEach
    public void setup() {
        method4 = new Method4();
    }

    @Test
    public void getTwelveSetsOfScoresTest() {
        assertThat(method4.rollScores().getScores())
                .asList()
                .as("Has twelve sets of scores")
                .hasSize(12);
    }
}
