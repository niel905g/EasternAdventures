package dk.hungarian;

import dk.hungarian.genstande.AK47;
import dk.hungarian.genstande.Vodka;
import dk.hungarian.skabninger.Helle_Thorning;
import dk.hungarian.skabninger.Ladyboy;
import dk.hungarian.skabninger.RussiskSpritter;

public class Test {

    public static void test1() {
        // Her kommer testkoden
        Player grete = new Player("Grete");
        grete.displayPosition();
        // DEBUG  System.out.println("Grete er på X" + grete.getPosition()[0] + "Y" +grete.getPosition()[1]);

        Skabning s = new Skabning("Test", "Test", 1, Gender.APACHE_HELICOPTER);
        // Man kan ikke instansiere en abstract klasse
        // Genstand g = new Genstand();

        RussiskSpritter russer = new RussiskSpritter(70);
        System.out.println(russer.toString());

        // Jeg tester Helle klassen
        Helle_Thorning helle = new Helle_Thorning(2);
        System.out.println(helle.toString());
        System.out.println(helle.getGender());

        // Jeg viser, hvordan et felt kan indeholde to AK47 begravet
        Felt f = new Felt();
        AK47 v1 = new AK47("våben 1", "et godt våben", 100);
        AK47 v2 = new AK47("våben 2", "et godt våben", 100);
        f.genstand[0] = v1;
        f.genstand[1] = v2;
        System.out.println("På feltet er der begravet");
        System.out.println(f.genstand[0].navn);
        System.out.println(f.genstand[1].navn);
        System.out.println(f.genstand[2]);

        Ladyboy nimnam = new Ladyboy();
        nimnam.toString();
        System.out.println(nimnam.getNavn());
        Vodka glasVodka = new Vodka();
        glasVodka.toString();

        Skabning.yo();
        Ladyboy.yo();


    }

}
