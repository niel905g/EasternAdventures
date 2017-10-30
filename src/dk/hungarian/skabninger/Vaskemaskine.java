package dk.hungarian.skabninger;
import dk.hungarian.Gender;
import dk.hungarian.Skabning;

public class Vaskemaskine extends Skabning {
   int feministLVL;     // fra 1-100.
    public Vaskemaskine(int feministLVL) {
        super("Triggered Feminist", "Do not say a thing. They will be triggered by anything",
                10, Gender.KVINDE);
        this.feministLVL = feministLVL;
    }

    public String catchPhrase() {
        if (feministLVL>20) {return "What is your name?"; }
        if (feministLVL>40) {return "WHAT IS YOUR NAME?"; }
        if (feministLVL>60) {return "IS THAT SEXUAL HARASSMENT?"; }
        if (feministLVL>80) {return "THIS MAN JUST ABUSED A WOMAN"; }
        if (feministLVL==100) {return "HOW DARE YOU! HOW DAAAAAAAAAARE YOU! REEEEEEEEEEEEEEE"; }
        else { return "Hellooo."; }
    }

}



