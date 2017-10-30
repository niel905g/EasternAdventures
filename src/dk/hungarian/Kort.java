package dk.hungarian;

import dk.hungarian.skabninger.Helle_Thorning;

public class Kort {
    public Felt[][] kort = new Felt[10][10];

    public Kort() {
        for (int y = 0; y < 10; y++)
        {
            for (int x = 0; x < 10; x++) {
                Felt feltet = new Felt();
                kort[x][y] = feltet;
                // DEBUG
                // System.out.print("Har tilføjet X" + x + "y" + y + " felt til kortet.");
                // DEBUG
                // System.out.println( " " + feltet.beskrivelse);
            }
        }

        // Tilføjer Helle på 9,9, for hun er en final boss
        Helle_Thorning helle = new Helle_Thorning(5);
        kort[9][9].skabning = helle;
    }

}
