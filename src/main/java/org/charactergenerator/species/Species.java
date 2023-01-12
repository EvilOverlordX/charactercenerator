package org.charactergenerator.species;

import java.util.Locale;

public enum Species {
    DWARF("Dwarf"),
    ELF("Elf"),
    GNOME("Gnome"),
    HALF_ELF("Half Elf"),
    HALFLING("Halfling"),
    HALF_ORC("Half Orc"),
    HUMAN("Human");

    private final String name;

    Species(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public static Species getSpeciesByName(String name) {
        return switch(name.toLowerCase(Locale.ROOT).replaceAll(" ", "")) {
            case "dwarf" -> DWARF;
            case "elf" -> ELF;
            case "gnome" -> GNOME;
            case "halfelf" -> HALF_ELF;
            case "halfling" -> HALFLING;
            case "halforc" -> HALF_ORC;
            default -> HUMAN;
        };
    }
}
