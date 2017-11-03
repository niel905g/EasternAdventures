package dk.hungarian.skabninger;

import dk.hungarian.Gender;
import dk.hungarian.Skabning;

public class NisseFar extends Skabning{
    private int hvorArrig = 100;
 //   int malechouvenist;


    public NisseFar(String navn, String beskrivelse, int styrke, Gender gender) {
        super(navn, beskrivelse, styrke, gender);
    }

    public NisseFar(int hvorArrig) {
        super("larsLykke", "Nissefar er meget farlig når han er 100% malechouvenistisk arrig!", 100, Gender.VATNISSE);
        this.hvorArrig = hvorArrig;
    }

    @Override
    public String toString(){
        return " Du har mødt " + this.getNavn() + " som er " + hvorArrig;
    }

    public int getHvorArrig() {
        return hvorArrig;
    }

    public void setHvorArrig(int hvorArrig) {
        this.hvorArrig = hvorArrig;
    }

    @Override
    public String look() {
        return null;
    }
}
