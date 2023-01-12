package org.charactergenerator.species;

import org.charactergenerator.attributes.Maximums;
import org.charactergenerator.attributes.Minimums;

import static org.charactergenerator.attributes.DefaultMaximums.getDefaultMaximum;
import static org.charactergenerator.attributes.DefaultMinimums.getBareMinimum;
import static org.charactergenerator.attributes.DefaultMinimums.getDefaultMinimum;

public final class HalfElf implements Minimums, Maximums {

    @Override
    public int maximumStrength() {
        return getDefaultMaximum();
    }

    @Override
    public int maximumExceptionalStrength() {
        return 90;
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
        return 4;
    }

    @Override
    public int minimumWisdom() {
        return getBareMinimum();
    }

    @Override
    public int minimumDexterity() {
        return getDefaultMinimum();
    }

    @Override
    public int minimumConstitution() {
        return getDefaultMinimum();
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
