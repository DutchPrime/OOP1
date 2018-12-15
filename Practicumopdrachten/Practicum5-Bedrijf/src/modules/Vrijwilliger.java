package modules;

import interfaces.Oproepbaar;

public class Vrijwilliger extends Persoon implements Oproepbaar {
    //Constructors
    public Vrijwilliger(String naam){
        super(naam);
    }

    //Methods
    @Override
    public double berekenInkomsten() {
        return 0;
    }

    public void huurIn(int uren){

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
