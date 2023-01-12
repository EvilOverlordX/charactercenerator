package org.charactergenerator.species;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.charactergenerator.species.Species.*;

public final class SpeciesTest {

    @Test
    public void getDwarfByNameTest() {
        assertThat(getSpeciesByName("Dwarf")).as("Checking for Dwarf").isEqualTo(DWARF);
    }

    @Test
    public void getElfByNameTest() {
        assertThat(getSpeciesByName("Elf")).as("Checking for Elf").isEqualTo(ELF);
    }

    @Test
    public void getGnomeByNameTest() {
        assertThat(getSpeciesByName("Gnome")).as("Checking for Gnome").isEqualTo(GNOME);
    }

    @Test
    public void getHalfElfByNameTest() {
        assertThat(getSpeciesByName("HalfElf")).as("Checking for Half Elf").isEqualTo(HALF_ELF);
    }

    @Test
    public void getHalflingByNameTest() {
        assertThat(getSpeciesByName("Halfling")).as("Checking for Halfling").isEqualTo(HALFLING);
    }

    @Test
    public void getHalfOrcByNameTest() {
        assertThat(getSpeciesByName("HalfOrc")).as("Checking for Half Orc").isEqualTo(HALF_ORC);
    }

    @Test
    public void getHumanByNameTest() {
        assertThat(getSpeciesByName("Human")).as("Checking for Human").isEqualTo(HUMAN);
    }

    @Test
    public void lowercaseTest() {
        assertThat(getSpeciesByName("human")).as("Checking for lowercase").isEqualTo(HUMAN);
    }

    @Test
    public void uppercaseTest() {
        assertThat(getSpeciesByName("HUMAN")).as("Checking for uppercase").isEqualTo(HUMAN);
    }

    @Test
    public void spaceRemovalTest() {
        assertThat(getSpeciesByName("Half Orc    ")).as("Checking for removal of spaces").isEqualTo(HALF_ORC);
    }

    @Test
    public void defaultToHumanTest() {
        assertThat(getSpeciesByName("jkahdskjHXZX<HD")).as("Checking for Human as default value").isEqualTo(HUMAN);
    }

}
