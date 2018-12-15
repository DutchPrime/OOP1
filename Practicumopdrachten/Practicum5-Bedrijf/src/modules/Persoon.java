package modules;

/**
 * @auhtor Koen Lippe 500794493
 */

public abstract class Persoon implements Comparable {
    //Variables
    private String naam;

    //Constructor
    public Persoon(String naam) {
        this.naam = naam;
    }

    //Methods
    public abstract double berekenInkomsten();

    public int compareTo(Persoon ander) {

        return this.naam.compareTo(ander.naam);
    }

    @Override
    public String toString() {
        return this.naam;
    }
}
