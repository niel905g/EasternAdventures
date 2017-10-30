package dk.hungarian.skabninger;

import dk.hungarian.Gender;
import dk.hungarian.Skabning;
//LAvet af Michael (SaneStreet)
public class MasterofJava extends Skabning {

    int coffeeLevel;
    public MasterofJava(String navn, String beskrivelse, int styrke, Gender gender, int coffeeLevel) {
        super(navn, beskrivelse, styrke, gender);
        this.coffeeLevel = coffeeLevel;
    }

    public MasterofJava(){
        super("The Master of Java", "He just makes Coffee..", 1, Gender.UKØNNET);
        this.coffeeLevel = 100;
    }
}
