package modules;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Koen Lippe 500794493
 */

public class Bedrijf {
    //Variables
    private String naam;
    private ArrayList<Persoon> medewerkers = new ArrayList<Persoon>();

    //Constructors
    public Bedrijf(String naam) {
        this.naam = naam;
    }

    public void printInkomsten() {
        Collections.sort(medewerkers);

        System.out.println("Inkomsten van alle personen:");

        //Check if medewerker is an vrijwilliger
        for (Persoon persoon : medewerkers){
            System.out.printf("\t%s: %f%n", persoon.toString(), persoon.berekenInkomsten());
        }
    }

    public int aantalManagers() {
        int aantalManagers = 0;

        for(Persoon persoon : medewerkers){
            if (persoon instanceof Manager){
                aantalManagers++;
            }
        }

        return aantalManagers;
    }

    public void neemInDienst(Persoon persoon) {
        this.medewerkers.add(persoon);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Bedrijf %s heeft %d medewerkers%n", this.naam, this.medewerkers.size()));
        for (Persoon persoon : medewerkers) {
            stringBuilder.append(String.format("\t %s%n", persoon.toString()));
        }
        return stringBuilder.toString();
    }
}
