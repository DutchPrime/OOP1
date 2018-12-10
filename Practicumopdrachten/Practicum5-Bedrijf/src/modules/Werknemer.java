package modules;

public class Werknemer extends Persoon {
    //Variables
    private static int laatstePersoneelnummer;
    private double maandSalaris;
    private int personeelnummer;

    //Constructor
    public Werknemer(){

    }
     public Werknemer(double maandsalaris, String naam){
        super(naam);
        this.maandSalaris = maandsalaris;
     }

    //Methods
    @Override
    public double berekenInkomsten() {
        return 0;
    }
}
