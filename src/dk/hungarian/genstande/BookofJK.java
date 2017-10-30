package dk.hungarian.genstande;

import dk.hungarian.Genstand;
//LAvet af Michael (SaneStreet)
public class BookofJK extends Genstand {

    public BookofJK(String navn, String beskrivelse, int styrke) {
        super(navn, beskrivelse, styrke);
    }

    public BookofJK(){
        super("Introduction to Java Programming", "The No. 1 Instructional Book for learning Java programming. Increases your Java Knowledge by 100.", 100);
    }
}
