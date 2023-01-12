package org.charactergenerator.species;

import org.charactergenerator.attributes.Maximums;
import org.charactergenerator.attributes.Minimums;

import static org.charactergenerator.attributes.DefaultMaximums.getDefaultMaximum;
import static org.charactergenerator.attributes.DefaultMinimums.getBareMinimum;

public final class Dwarf implements Minimums, Maximums {

    @Override
    public int maximumStrength() {
        return getDefaultMaximum();
    }

    @Override
    public int maximumExceptionalStrength() {
        return 99;
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
        return 17;
    }

    @Override
    public int maximumConstitution() {
        return 19;
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
        return 8;
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
        return 12;
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
