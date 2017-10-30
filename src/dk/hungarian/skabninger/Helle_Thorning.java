package dk.hungarian.skabninger;

import dk.hungarian.Gender;
import dk.hungarian.Skabning;

public class Helle_Thorning extends Skabning {
    int feministlevel;


    public Helle_Thorning(int feministlevel) {
        super(" Helle Thorning ", " Wild Feminist ", 4, Gender.APACHE_HELICOPTER);
        this.feministlevel = feministlevel;
    }

    @Override
    public String toString(){
        return " You have triggered " + this.getNavn() + " er " + feministlevel;
    }


}
