package modules;

/**
 * Description
 *
 * @author Koen Lippe 500794493
 */

public class Werknemer extends Persoon {
    //Variables
    private static int laatstePersoneelnummer = 999;
    private double maandSalaris;
    private int personeelsnummer;


    //Constructor
    public Werknemer( double maandSalaris, String naam) {
        super(naam);
        this.maandSalaris = maandSalaris;

        laatstePersoneelnummer++;
        this.personeelsnummer = laatstePersoneelnummer;
    }

    //Methods
    @Override
    public double berekenInkomsten() {
        return maandSalaris;
    }
}
