package org.charactergenerator.classes;

import org.charactergenerator.attributes.Maximums;
import org.charactergenerator.attributes.Minimums;

import static org.charactergenerator.attributes.DefaultMaximums.getDefaultMaximum;
import static org.charactergenerator.attributes.DefaultMinimums.*;

public final class Cleric implements Minimums, Maximums {

    @Override
    public int maximumStrength() {
        return getDefaultMaximum();
    }

    @Override
    public int maximumExceptionalStrength() {
        return getStandardMinimumExceptionalStrength();
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
        return getDefaultMaximum();
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
        return getDefaultMinimum();
    }

    @Override
    public int minimumIntelligence() {
        return getDefaultMinimum();
    }

    @Override
    public int minimumWisdom() {
        return 9;
    }

    @Override
    public int minimumDexterity() {
        return getBareMinimum();
    }

    @Override
    public int minimumConstitution() {
        return getDefaultMinimum();
    }

    @Override
    public int minimumCharisma() {
        return getDefaultMinimum();
    }

    @Override
    public int minimumComeliness() {
        return getDefaultMinimum();
    }
}
