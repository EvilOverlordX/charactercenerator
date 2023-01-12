package org.charactergenerator.attributes;

public final class DefaultMaximums {

    private static final int DEFAULT_MAXIMUM = 18;
    private static final int MAXIMUM_EXCEPTIONAL_STRENGTH = 100;

    private DefaultMaximums() {}

    public static int getDefaultMaximum() { return DEFAULT_MAXIMUM; }
    public static int getMaximumExceptionalStrength() { return MAXIMUM_EXCEPTIONAL_STRENGTH; }

}
