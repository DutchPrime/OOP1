package models;

/**
 * This class represents a Vuurwerk object
 *
 * @author Koen Lippe 500794493
 */
public class Vuurwerk extends Product {
    //Variables
    private Instructie instructie;

    //Constructors

    /**
     * This constructor creates an instance of Knaller
     *
     * @param naam       the name of the Vuurwerk
     * @param prijs      the price of the Vuurwerk
     * @param instructie the instruction that comes with the Vuurwerk
     */
    public Vuurwerk(String naam, double prijs, Instructie instructie) {
        super(naam, prijs);
        this.instructie = instructie;
    }

    public Vuurwerk(String naam, double prijs){
        super(naam, prijs);
    }
    //Methods

    /**
     * Returns the instruction
     *
     * @return returns instruction (Instructie)
     */
    public Instructie getInstructie() {
        return instructie;
    }

    /**
     * Returns if the Vuurwerk is legal
     *
     * @return true or false statement indicating if the Vuurwerk is legal
     */
    @Override
    public boolean isLegaal() {
        return instructie != null && instructie.isNederlandstalig();
    }

    /**
     * This method gives a visual representation of the Vuurwerk's information
     * To be used to print out on the screen
     *
     * @return string containing information of the Vuurwerk
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());


        if (instructie == null) {
            stringBuilder.append("\tInstructie: ontbreekt\n");
        } else {
            stringBuilder.append(String.format("\tInstructie: %s%n", instructie.toString()));
        }

        stringBuilder.append(String.format("\tLegaal: %b%n", isLegaal()));

        return stringBuilder.toString();


    }
}
