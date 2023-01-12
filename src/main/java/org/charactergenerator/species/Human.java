package org.charactergenerator.species;

import org.charactergenerator.attributes.Maximums;
import org.charactergenerator.attributes.Minimums;

import static org.charactergenerator.attributes.DefaultMaximums.getDefaultMaximum;
import static org.charactergenerator.attributes.DefaultMaximums.getMaximumExceptionalStrength;
import static org.charactergenerator.attributes.DefaultMinimums.getBareMinimum;

public final class Human implements Minimums, Maximums {
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
        return getBareMinimum();
    }

    @Override
    public int minimumIntelligence() {
        return getBareMinimum();
    }

    @Override
    public int minimumWisdom() {
        return getBareMinimum();
    }

    @Override
    public int minimumDexterity() {
        return getBareMinimum();
    }

    @Override
    public int minimumConstitution() {
        return getBareMinimum();
    }

    @Override
    public int minimumCharisma() {
        return getBareMinimum();
    }

    @Override
    public int minimumComeliness() {
        return getBareMinimum();
    }
}
