package org.charactergenerator.species;

import org.charactergenerator.attributes.Maximums;
import org.charactergenerator.attributes.Minimums;

import static org.charactergenerator.attributes.DefaultMaximums.getDefaultMaximum;
import static org.charactergenerator.attributes.DefaultMinimums.getBareMinimum;
import static org.charactergenerator.attributes.DefaultMinimums.getDefaultMinimum;

public final class Elf implements Minimums, Maximums {

    @Override
    public int maximumStrength() {
        return getDefaultMaximum();
    }

    @Override
    public int maximumExceptionalStrength() {
        return 75;
    }

    @Override
    public int maximumIntelligence() {
        return getDefaultMaximum();
    }

    @Override
    public int maximumWisdom() {
        return getDefaultMaximum();
    }

    @Override
    public int maximumDexterity() {
        return 19;
    }

    @Override
    public int maximumConstitution() {
        return getDefaultMaximum();
    }

    @Override
    public int maximumCharisma() {
        return getDefaultMaximum();
    }

    @Override
    public int maximumComeliness() {
        return getDefaultMaximum();
    }

    @Override
    public int minimumStrength() {
        return getBareMinimum();
    }

    @Override
    public int minimumIntelligence() {
        return 8;
    }

    @Override
    public int minimumWisdom() {
        return getBareMinimum();
    }

    @Override
    public int minimumDexterity() {
        return 7;
    }

    @Override
    public int minimumConstitution() {
        return getDefaultMinimum();
    }

    @Override
    public int minimumCharisma() {
        return 8;
    }

    @Override
    public int minimumComeliness() {
        return getBareMinimum();
    }
}
