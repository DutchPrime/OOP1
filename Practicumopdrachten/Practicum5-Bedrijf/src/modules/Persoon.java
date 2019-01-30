package modules;

/**
 * This class represents a Persoon object.
 *
 * @auhtor Koen Lippe 500794493
 */

public abstract class Persoon implements Comparable<Persoon> {
    //Variables
    private String naam;

    //Constructor

    /**
     * This method creates a object of Persoon.
     *
     * @param naam the name of the Persoon
     */
    public Persoon(String naam) {
        this.naam = naam;
    }

    //Methods

    /**
     * This abstract method forces any subclass to have a berekenInkomsten method.
     * This subclass its method calculates the monthly income for every type of Persoon.
     *
     * @return the monthly income
     */
    public abstract double berekenInkomsten();


    //This method should alphabetically order all persons
    public int compareTo(Persoon ander) {
        return this.naam.compareTo(ander.naam);
    }

    /**
     * This method overrides the Java method toString().
     *
     * @return the name of the Persoon     *
     */
    @Override
    public String toString() {
        return this.naam;
    }
}
