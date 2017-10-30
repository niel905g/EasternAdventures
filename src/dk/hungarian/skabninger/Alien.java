package dk.hungarian.skabninger;

import dk.hungarian.Gender;
import dk.hungarian.Skabning;

public class Alien extends Skabning {

    int alder;
    String oprindelsesPlanet;

    public Alien(String navn, String beskrivelse, int styrke, Gender gender, int alder, String oprindelsesPlanet) {
        super(navn, beskrivelse, styrke, gender);
        this.alder = alder;
        this.oprindelsesPlanet = oprindelsesPlanet;
    }

    @Override
    public String toString() {
        return "Aliens navn er " + this.getNavn() + ", den er " + this.alder + ", det er en " + this.getGender() + " og han kommer fra " + this.oprindelsesPlanet;
    }
}
