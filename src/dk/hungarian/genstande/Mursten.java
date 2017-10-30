package dk.hungarian.genstande;

import dk.hungarian.Genstand;
import dk.hungarian.skabninger.Vaskemaskine;

public class Mursten extends Genstand {
    int triggerReduction;

    public Mursten(String triggerReduction) {
        super("Mursten", "Brug denne mursten for trigger-reduction", 60);
        this.triggerReduction = Integer.getInteger(triggerReduction);
    }
    public String kast() {
        if (triggerReduction>0){
            return "Murstenen er ubrugelig. Feministen er ikke triggered.";
        }
        if (triggerReduction<1) {
            return "Kast murstenen! Feministen er triggered!";
        }

        return "Default case.";
    }
}
