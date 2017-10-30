package dk.hungarian;

import dk.hungarian.genstande.Fakkel;
import dk.hungarian.skabninger.Vampyr;
import dk.hungarian.genstande.BookofJK;
import dk.hungarian.skabninger.MasterofJava;

public class Test {

    public static void test1() {
        // Her kommer testkoden
        Player grete = new Player("Grete");
        grete.displayPosition();
        // DEBUG  System.out.println("Grete er på X" + grete.getPosition()[0] + "Y" +grete.getPosition()[1]);

        Skabning s = new Skabning("as", "as", 1, Gender.APACHE_HELICOPTER);
        // Man kan ikke instanciere en abstract klasse

        // Genstand g = new Genstand();

        //Tester min skabning og genstand
        /*MasterofJava master = new MasterofJava();
        System.out.println(master.getNavn());
        System.out.println(master.getBeskrivelse());
        System.out.prinln(master.getStyrke());
        BookofJK javaknow = new BookofJK();
        System.out.println(javaknow.getNavn());
        System.out.println(javaknow.getBeskrivelse());
        System.out.println(javaknow.getStyrke());*/
    }

}
