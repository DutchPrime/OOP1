package models;

/**
 * This class represents a Knaller
 *
 * @author Koen Lippe 500794493
 */

public class Knaller extends Vuurwerk {
    //Variables
    private int aantalKnallen;
    private int decibel;

    private final int MAX_DECIBEL = 120;

    //Constructor

    /**
     * This constructor creates an instance of Knaller
     *
     * @param naam          The name of the Knaller
     * @param prijs         The price of the Knaller
     * @param aantalKnallen the amount of blasts of the Knaller
     * @param decibel       the amount of decibel the Knaller generates
     * @param instructie    the instructions that go with the product
     */
    public Knaller(String naam, double prijs, int aantalKnallen, int decibel, Instructie instructie) {
        super(naam, prijs, instructie);
        this.aantalKnallen = aantalKnallen;
        this.decibel = decibel;
    }

    //Methods

    /**
     * This method lets you get the amount of decibel associated with the Knaller
     *
     * @return integer representing the decibels of the product
     */
    public int getDecibel() {
        return decibel;
    }

    /**
     * This method checks if the product is legal
     *
     * @return true or false statement indicating if Knaller is legal
     */
    @Override
    public boolean isLegaal() {
        return super.isLegaal() && decibel <= MAX_DECIBEL;
    }

    /**
     * This method gives a visual representation of the Knaller's information
     * To be used to print out on the screen
     *
     * @return string containing information of the Knaller
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(super.toString());
        stringBuilder.append(String.format("\tAantal knallen: %d%n", aantalKnallen));
        stringBuilder.append(String.format("\tDecibel: %d%n", decibel));

        return stringBuilder.toString();
    }
}
