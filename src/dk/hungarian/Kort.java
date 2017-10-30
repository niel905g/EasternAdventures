package dk.hungarian;

public class Kort {
    Felt[][] kort = new Felt[10][10];

    public Kort() {
        for (int y = 0; y < 10; y++)
        {
            for (int x = 0; x < 10; x++) {
                Felt feltet = new Felt();
                kort[x][y] = feltet;
                System.out.print("Har tilføjet X" + x + "y" + y + " felt til kortet.");
                System.out.println( " " + feltet.beskrivelse);
            }
        }
    }

}
