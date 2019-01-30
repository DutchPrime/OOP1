package modules;

/**
 * Description
 *
 * @author Koen Lippe 500794493
 */

public abstract class Persoon implements Comparable<Persoon>{
    //Variables
    private String naam;

    //Constructor
    public Persoon (String naam){
        this.naam = naam;
    }

    //Methods
    public abstract double berekenInkomsten();


    @Override
    public String toString() {
        return this.naam;
    }

    @Override
    public int compareTo(Persoon ander) {
        return this.naam.compareTo(ander.naam);
    }
}
