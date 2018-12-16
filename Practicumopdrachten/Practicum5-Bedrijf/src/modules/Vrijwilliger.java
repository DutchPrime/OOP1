package modules;

import interfaces.Oproepbaar;

/**
 * This class represents a Vrijwilliger object
 */
public class Vrijwilliger extends Persoon implements Oproepbaar {
    //Constructors

    /**
     * This constructor creates an instance of Vrijwilliger
     *
     * @param naam the name of the Vrijwilliger
     */
    public Vrijwilliger(String naam) {
        super(naam);
    }

    //Methods

    /**
     * This method calculates the monthly salary of the Vrijwilliger (0)
     *
     * @return the monthly salary of the vrijwilliger (aka 0)
     */
    @Override
    public double berekenInkomsten() {
        return 0;
    }

    /**
     * This method adds the Vrijwilliger to the werknemers array
     *
     * @param uren the amount of hours to hire the Vrijwilliger
     */
    public void huurIn(int uren) {

    }

}