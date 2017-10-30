package dk.hungarian.skabninger;

import dk.hungarian.Gender;
import dk.hungarian.Skabning;

public class SurMor extends Skabning {
    //Hvor sur er hun
    int hvorSur;
    //Constructor til surmor.
    public SurMor(int hvorSur){
        super("Olga", "En sur russisk mor",0, Gender.KVINDE);
        //Hendes styrke er by default 0, men lig med hendes surhed.
                this.hvorSur = hvorSur;
                this.setStyrke(hvorSur);
    }
}
 //Se fluffybunny_sværd klassen for kode til testklassen.