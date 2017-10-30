package dk.hungarian.skabninger;

import dk.hungarian.Gender;
import dk.hungarian.Skabning;

public class Alien extends Skabning {

    int alder;

    public Alien(String navn, String beskrivelse, int styrke, Gender gender, int alder) {
        super(navn, beskrivelse, styrke, gender);
        this.alder = alder;
    }

    @Override
    public String toString() {
        return "Aliens navn er " + this.getNavn() + ", den er " + this.alder + " og det er en " + this.getGender();
    }
}
