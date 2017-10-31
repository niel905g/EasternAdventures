package dk.hungarian;

import java.util.ArrayList;

public class Player {
    private String navn;
    private ArrayList inventory;
    private int positionX = 4;
    private int positionY = 4;

    /* Constructor */
    public Player(String navn) {
        this.navn = navn;
        System.out.println("Velkommen til EasterAdventures, " + navn + "!");
    }

    /* Viser position direkte på System.out */
    public void displayPosition() {
        System.out.println("Du står på X" + positionX + "Y" + positionX + ".");
    }

    /* Returnererer et array med spillerens X og Y koordinater [int x, int y]  */
    public int[] getPosition() {
        int[] position = new int[2];
        position[0] = positionX;
        position[1] = positionY;
        return position;
    }

    /* Getters og setters for spillerens navn */
    public String getNavn() {
        return navn;
    }
    public void setNavn(String navn) {
        this.navn = navn;
    }

}
