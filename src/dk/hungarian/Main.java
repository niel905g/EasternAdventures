/*
 *
 */
package dk.hungarian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Boolean debug = true;
        System.out.println("Velkommen. Indtast dit navn:");

        if (debug) {
            Player player = new Player("Hans");
        } else
        {
            Scanner input = new Scanner(System.in);
            String navn = input.next();
            Player player = new Player(navn); }
        Test.test1();
    }
}
