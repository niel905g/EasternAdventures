package dk.hungarian;

public class Test {

    public static void test1() {
        // Her kommer testkoden
        Player grete = new Player("Grete");
        grete.displayPosition();
        // DEBUG  System.out.println("Grete er på X" + grete.getPosition()[0] + "Y" +grete.getPosition()[1]);

        Skabning s = new Skabning("as", "as", 1, Gender.APACHE_HELICOPTER);
        // Man kan ikke instanciere en abstract klasse
        // Genstand g = new Genstand();
    }

}
