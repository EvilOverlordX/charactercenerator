package org.charactergenerator.attributes;

public final class DefaultMinimums {

    private static final int DEFAULT_MINIMUM = 6;

    private static final int BARE_MINIMUM = 3;
    private static final int STANDARD_MINIMUM_EXCEPTIONAL_STRENGTH = -1;

    private static final int FIGHTER_MINIMUM_EXCEPTIONAL_STRENGTH = 1;

    private DefaultMinimums() {}

    public static int getDefaultMinimum() { return DEFAULT_MINIMUM; }
    public static int getBareMinimum() { return BARE_MINIMUM; }
    public static int getStandardMinimumExceptionalStrength() { return STANDARD_MINIMUM_EXCEPTIONAL_STRENGTH; }
    public static int getFighterMinimumExceptionalStrength() { return FIGHTER_MINIMUM_EXCEPTIONAL_STRENGTH; }

}
