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

    /* Main classen starter spillet, og bringer alle de andre klasser i spil. */
    public static void main(String[] args) {

        Boolean debug = true; // Vi indbygger en debug mode i vores kode, så vi ikke behøver at spille spillet hver gange, vi tester
        Kort kortet = new Kort();
        Player player;

        if (debug) {
            player = new Player("Hans");
        } else
        {
            System.out.println("Velkommen. Indtast dit navn:");
            Scanner input = new Scanner(System.in);
            String navn = input.next();
            player = new Player(navn);
        }

        Test.test1(player);

    }
}
