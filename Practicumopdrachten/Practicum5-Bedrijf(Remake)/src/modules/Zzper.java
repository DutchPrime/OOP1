package modules;

import interfaces.Oproepbaar;

/**
 * Description
 *
 * @author Koen Lippe 500794493
 */

public class Zzper extends Persoon implements Oproepbaar {
    //Varibles
    private double uurtarief;
    private int urenGewerkt;

    //Constructor
    public Zzper(int uurtarief, String naam) {
        super(naam);
        this.uurtarief = uurtarief;
    }

    @Override
    public double berekenInkomsten() {
        return urenGewerkt * uurtarief;
    }

    @Override
    public void huurIn(int uren) {
        urenGewerkt += uren;
    }
}
