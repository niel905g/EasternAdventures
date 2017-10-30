package dk.hungarian;

public class Felt {
    public String beskrivelse;
    public Genstand[] genstand;
    public Skabning skabning;

    public Felt() {
        beskrivelse = "Du står et random sted i Rusland.";
        genstand = new Genstand[3]; // Der må maks være 3 ting på et felt
    }

}
