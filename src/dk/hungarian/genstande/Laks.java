package dk.hungarian.genstande;

import dk.hungarian.Genstand;

/** Mathias Elholm **/

public class Laks extends Genstand {

    int howSlimy; // Vælg hvor slimet laksen skal være

    public Laks(String navn, String beskrivelse, int styrke) {
        super(navn, beskrivelse, styrke);
        this.howSlimy = howSlimy;
    }

    public Laks(){
        super("# Laks:", " den er våd, slimet og lugtende! #", 15);
    }

}
