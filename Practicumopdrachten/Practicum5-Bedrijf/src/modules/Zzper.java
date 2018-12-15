package modules;

import interfaces.Oproepbaar;

public class Zzper extends Persoon implements Oproepbaar {
    //Variables
    private double uurtarief;
    private int urenGewerkt;

    //Constructor
    public Zzper(double uurtarief, String naam){
        super(naam);
        this.uurtarief = uurtarief;
    }

    //Methods
    @Override
    public double berekenInkomsten() {
        return this.urenGewerkt * this.uurtarief;
    }

    public void huurIn(int uren){
        this.urenGewerkt += uren;

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
