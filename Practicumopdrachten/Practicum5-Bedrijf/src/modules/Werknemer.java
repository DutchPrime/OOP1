package modules;

/**
 * @author Koen Lippe 500794493
 */

public class Werknemer extends Persoon {
    //Variables
    private final int PERSONEEL_NUMMER_START = 1000;
    private static int laatstePersoneelnummer;
    private double maandSalaris;
    private int personeelsnummer;

    //Constructor
    public Werknemer(double maandsalaris, String naam) {
        super(naam);
        this.maandSalaris = maandsalaris;

        //Assigning personeelsnummer. Basic value for integer is 0
        if (this.personeelsnummer == 0) {
            this.personeelsnummer = PERSONEEL_NUMMER_START;
            laatstePersoneelnummer = this.personeelsnummer;
        } else {
            this.personeelsnummer = laatstePersoneelnummer++;
            laatstePersoneelnummer++;
        }
    }

    //Methods
    @Override
    public double berekenInkomsten() {
        return this.maandSalaris;
    }

    //?????
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
