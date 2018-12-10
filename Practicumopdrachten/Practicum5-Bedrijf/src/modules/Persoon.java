package modules;

public class Persoon {
    //Variables
    private String naam;

    //Constructor
    //Weghalen
    public Persoon(){

    }
    public Persoon(String naam){
        this.naam = naam;
    }

    //Methods
    public double berekenInkomsten(){
        return 0;
    }

    public int compareTo(Persoon persoon){
        return 0;
    }

    @Override
    public String toString() {
        return this.naam;
    }
}
