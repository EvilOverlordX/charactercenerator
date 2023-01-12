package org.charactergenerator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class Method3Test {

    private Method3 method3;

    @BeforeEach
    public void setup() {
        method3 = new Method3();
    }

    @Test
    public void getSixScoresTest() {
        assertThat(method3.rollScores().getScores())
                .asList()
                .as("Has six elements")
                .hasSize(6);
    }


}
