package modules;

/**
 * This class represents a Manager
 *
 * @author Koen Lippe 500794493
 */
public class Manager extends Werknemer {
    //Variables
    private double bonus;

    //Constructors

    /**
     * This constructor creates an instance of Manager
     *
     * @param maandsalaris the monthly salary of the Manager
     * @param naam         the name of the Manager
     */
    public Manager(double maandsalaris, String naam) {
        super(maandsalaris, naam);
    }

    //Methods

    /**
     * This method sets the bonus to be given to the Manager
     *
     * @param bonus the bonus to be given to the Manager
     */
    public void kenBonusToe(double bonus) {
        this.bonus = bonus;
    }

    /**
     * This method calculates the monthly income of the Manager
     *
     * @return the monthly income of the Manager
     */
    @Override
    public double berekenInkomsten() {
        return super.berekenInkomsten() + this.bonus;
    }
}
