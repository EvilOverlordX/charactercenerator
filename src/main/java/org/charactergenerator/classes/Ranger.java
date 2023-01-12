package org.charactergenerator.classes;

import org.charactergenerator.attributes.Maximums;
import org.charactergenerator.attributes.Minimums;

import static org.charactergenerator.attributes.DefaultMaximums.getDefaultMaximum;
import static org.charactergenerator.attributes.DefaultMaximums.getMaximumExceptionalStrength;
import static org.charactergenerator.attributes.DefaultMinimums.getDefaultMinimum;

public final class Ranger implements Minimums, Maximums {

    @Override
    public int maximumStrength() {
        return getDefaultMaximum();
    }

    @Override
    public int maximumExceptionalStrength() {
        return getMaximumExceptionalStrength();
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
        return 13;
    }

    @Override
    public int minimumIntelligence() {
        return 13;
    }

    @Override
    public int minimumWisdom() {
        return 14;
    }

    @Override
    public int minimumDexterity() {
        return getDefaultMinimum();
    }

    @Override
    public int minimumConstitution() {
        return 14;
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
