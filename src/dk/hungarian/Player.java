package dk.hungarian;

public class Player {
    private String navn;
    private Genstand[] taske;
    private int positionX = 4;
    private int positionY = 4;

    public Player(String navn) {
        this.navn = navn;
        System.out.println("Velkommen til EasterAdventures " + navn);
    }

    public void displayPosition() {
        System.out.println("Jeg er på X" + positionX + "Y" +positionX);
    }

    public int[] getPosition() {
        int[] position = new int[2];
        position[0] = positionX;
        position[1] = positionY;
        return position;
    }

    public String getNavn() {
        return navn;
    }
    public void setNavn(String navn) {
        this.navn = navn;
    }

}
