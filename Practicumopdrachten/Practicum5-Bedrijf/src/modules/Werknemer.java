package modules;

/**
 * This class representa a Werknemer object
 *
 * @author Koen Lippe 500794493
 */

public class Werknemer extends Persoon {
    //Variables
    private final int PERSONEEL_NUMMER_START = 1000;
    private static int laatstePersoneelnummer;
    private double maandSalaris;
    public int personeelsnummer;

    //Constructor

    /**
     * This method creates an object of Werknemer.
     *
     * @param maandsalaris the Werknemers's monthly salary.
     * @param naam         the name of the Werknemer
     */
    public Werknemer(double maandsalaris, String naam) {
        super(naam);
        this.maandSalaris = maandsalaris;

        if(laatstePersoneelnummer == 0){
            laatstePersoneelnummer = PERSONEEL_NUMMER_START;
            this.personeelsnummer = laatstePersoneelnummer;
        }
        else{
            laatstePersoneelnummer++;
            this.personeelsnummer = laatstePersoneelnummer;
        }
    }

    //Methods

    /**
     * This method returns the salary of the Werknemer
     *
     * @return salary of the werknemer
     */
    @Override
    public double berekenInkomsten() {
        return this.maandSalaris;
    }
}

