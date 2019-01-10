package models;

/**
 * This class represents an Instructie
 *
 * @author Koen Lippe 500794493
 */
public class Instructie {

    //Variables
    private boolean nederlandstalig;
    private int minimumLeeftijd;
    private String omschrijving;

    //Constructor

    /**
     * This constructor creates an Instructie object.
     *
     * @param nederlandstalig true or false indicating if the instruction is in Dutch
     * @param minimumLeeftijd This indicates the minimun age that is needed to act out the instructions
     * @param omschrijving    the instruction itself
     */
    public Instructie(boolean nederlandstalig, int minimumLeeftijd, String omschrijving) {
        this.nederlandstalig = nederlandstalig;
        this.minimumLeeftijd = minimumLeeftijd;
        this.omschrijving = omschrijving;
    }

    //Methods

    /**
     * This method checks of the instruction is in Dutch
     *
     * @return true of false value indicating if instruction is in Dutch
     */
    public boolean isNederlandstalig() {
        return nederlandstalig;
    }

    /**
     * Returns minimum age needed to act out the instruction
     *
     * @return integer indicating minimum age
     */
    public int getLeeftijd() {
        return minimumLeeftijd;
    }

    @Override
    public String toString() {
        return "Nederlandstalig=" + nederlandstalig + ", leeftijd=" + minimumLeeftijd + ", omschrijving=" + omschrijving;
    }
}


