package modules;

import interfaces.Oproepbaar;

public class Zzper extends Persoon implements Oproepbaar {
    //Variables
    private double uurtarief;
    private int urenGewerkt;

    //Constructor

    /**
     * This constructor creates an instance of Zzper
     *
     * @param uurtarief the hourly wage of the Zzper
     * @param naam      the name of the Zzper
     */
    public Zzper(double uurtarief, String naam) {
        super(naam);
        this.uurtarief = uurtarief;
    }

    //Methods
    /**
     * This mehtod calculates the salary of the Zzper based on the set hourly wage and the hours worked
     *
     * @return the salary of the Zzper
     */
    @Override
    public double berekenInkomsten() {
        return this.urenGewerkt * this.uurtarief;
    }

    /**
     * This method hires the Zzper
     *
     * @param uren the amount of hours that the Zzper will be working
     */
    public void huurIn(int uren) {
        this.urenGewerkt += uren;

    }
}
