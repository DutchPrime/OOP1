package modules;

public class Zzper extends Persoon {
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
        return 0;
    }

    public void huurIn(int uren){

    }
}
