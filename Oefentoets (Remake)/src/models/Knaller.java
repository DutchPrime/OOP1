package models;

/**
 * @author Koen Lippe 500794493
 */

public class Knaller extends Vuurwerk {
    //Variables
    private int aantalKnallen;
    private int decibel;

    //Constructor
    public Knaller(String naam, double prijs, int aantalKnallen, int decibel, Instructie instructie) {
        super(naam, prijs, instructie);
        this.aantalKnallen = aantalKnallen;
        this.decibel = decibel;
    }

    //Methods


    public int getDecibel() {
        return decibel;
    }

    @Override
    public boolean isLegaal() {
        return super.isLegaal() && decibel <= 120;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append(super.toString());
        s.append(String.format("\tAantal knallen: %d%n", aantalKnallen));
        s.append(String.format("\tDecibel: %d%n", decibel));

        return s.toString();
    }
}
