package org.charactergenerator.attributes;

public enum Attribute {
    STRENGTH("Strength", "STR"),
    EXCEPTIONAL_STRENGTH("Exceptional Strength", "XSTR"),
    INTELLIGENCE("Intelligence", "INT"),
    WISDOM("Wisdom", "WIS"),
    DEXTERITY("Dexterity", "DEX"),
    CONSTITUTION("Constitution", "CON"),
    CHARISMA("Charisma", "CHA"),
    COMELINESS("Comeliness", "COM");

    private final String name;
    private final String shortName;

    Attribute(String name, String shortName) {
        this.name = name;
        this.shortName = shortName;
    }

    public String getName() { return name; }
    public String getShortName() { return shortName; }

    public static Attribute getAttributeByShortName(String shortName) {
        return switch(shortName) {
            case "STR" -> STRENGTH;
            case "XSTR" -> EXCEPTIONAL_STRENGTH;
            case "INT" -> INTELLIGENCE;
            case "WIS" -> WISDOM;
            case "DEX" -> DEXTERITY;
            case "CON" -> CONSTITUTION;
            case "CHA" -> CHARISMA;
            default -> COMELINESS;
        };
    }
}
