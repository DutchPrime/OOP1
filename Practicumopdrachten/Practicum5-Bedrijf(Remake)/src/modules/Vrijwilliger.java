package modules;

import interfaces.Oproepbaar;

/**
 * Description
 *
 * @author Koen Lippe 500794493
 */

public class Vrijwilliger extends Persoon implements Oproepbaar {
    //Constructor
    public Vrijwilliger(String naam) {
        super(naam);
    }

    //Methods
    @Override
    public double berekenInkomsten() {
        return 0;
    }


    @Override
    public void huurIn(int uren) {

    }
}
