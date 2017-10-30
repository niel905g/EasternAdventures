/*
 *
 */
package dk.hungarian;

import dk.hungarian.genstande.FluffyBunny_sværd;
import dk.hungarian.skabninger.SurMor;

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













        /*Constructors til tingene
        SurMor surmor = new SurMor(25);
        System.out.println("Skabning " + surmor.getNavn() + "(" + surmor.getBeskrivelse() + ") har en surhedsgrad på: " + surmor.getStyrke() + ".");
        FluffyBunny_sværd fluffybunny = new FluffyBunny_sværd();
        System.out.println("Sværd " + fluffybunny.getNavn() + "(" + fluffybunny.getBeskrivelse() + "). Du laver et par slag ud i luften.." + fluffybunny.getLyd() + ". Du kan mærke kraften fra sværdet gennemstrømme din krop.");

*/
    }
}
