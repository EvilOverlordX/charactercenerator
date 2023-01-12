package org.charactergenerator.attributes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.charactergenerator.attributes.Attribute.*;

public final class AttributeTest {

    @Test
    public void getStrengthByShortNameTest() {
        assertThat(getAttributeByShortName("STR")).as("Checking for Strength").isEqualTo(STRENGTH);
    }

    @Test
    public void getIntelligenceByShortNameTest() {
        assertThat(getAttributeByShortName("INT")).as("Checking for Intelligence").isEqualTo(INTELLIGENCE);
    }

    @Test
    public void getWisdomByShortNameTest() {
        assertThat(getAttributeByShortName("WIS")).as("Checking for Wisdom").isEqualTo(WISDOM);
    }

    @Test
    public void getDexterityByShortNameTest() {
        assertThat(getAttributeByShortName("DEX")).as("Checking for Dexterity").isEqualTo(DEXTERITY);
    }

    @Test
    public void getConstitutionByShortNameTest() {
        assertThat(getAttributeByShortName("CON")).as("Checking for Constitution").isEqualTo(CONSTITUTION);
    }

    @Test
    public void getCharismaByShortNameTest() {
        assertThat(getAttributeByShortName("CHA")).as("Checking for Charisma").isEqualTo(CHARISMA);
    }

    @Test
    public void getComelinessByShortNameTest() {
        assertThat(getAttributeByShortName("COM")).as("Checking for Comeliness").isEqualTo(COMELINESS);
    }

    @Test
    public void defaultToComelinessTest() {
        assertThat(getAttributeByShortName("ZzZ")).as("Checking for Comeliness").isEqualTo(COMELINESS);
    }

}
