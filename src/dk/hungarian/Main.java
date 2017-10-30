/*
 *
 */
package dk.hungarian;

import dk.hungarian.genstande.Key;
import dk.hungarian.genstande.FluffyBunny_sværd;
import dk.hungarian.skabninger.SurMor;
import dk.hungarian.skabninger.Normie;
import dk.hungarian.skabninger.Scammer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Boolean debug = true;
        Kort kortet = new Kort();
        System.out.println("Velkommen. Indtast dit navn:");

        if (debug) {
            Player player = new Player("Hans");
        } else
        {
            Scanner input = new Scanner(System.in);
            String navn = input.next();
            Player player = new Player(navn); }
        Test.test1();

        Normie normie = new Normie();
        System.out.println(normie.useBattleCry());

        // Scammer har et argument af typen INT.
        Scammer scammer = new Scammer(90);
        System.out.println(scammer.toString());

    }
}
