package dk.hungarian.skabninger;

import dk.hungarian.Gender;
import dk.hungarian.Skabning;

public class RussiskSpritter extends Skabning {
    int hvorFuld; //En russisk spritter kan være 1..100 fuld

    // Constructor, som overloader superclassens constructor
    public RussiskSpritter(String navn, String beskrivelse, int styrke, Gender gender, int hvorFuld) {
        super(navn, beskrivelse, styrke, gender);
        this.hvorFuld = hvorFuld;
    }

    // Constructor, som overloader superclassens constructor
    public RussiskSpritter(int hvorFuld) {
        super("Fulde Igor", "Fulde Igor gør meget skade, han er spritstiv i vodka.", 10, Gender.MAND);
        this.hvorFuld = hvorFuld;
    }

    // toString metode, som overrider superclassens toString
    @Override
    public String toString() {
        return "RussiskSpritter " + this.getNavn() + " er " +
                + hvorFuld + "% fuld.";
    }
}
