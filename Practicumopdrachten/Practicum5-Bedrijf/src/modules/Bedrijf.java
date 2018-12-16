package modules;

import java.util.ArrayList;
import java.util.Collections;


/**
 * This class represents a Bedrijf object.
 *
 * @author Koen Lippe 500794493
 */

public class Bedrijf {
    //Variables
    private String naam;
    private ArrayList<Persoon> medewerkers = new ArrayList<>();

    //Constructors

    /**
     * This constructor creates an instance of a Bedrijf object.
     *
     * @param naam the name of the Bedrijf
     */
    public Bedrijf(String naam) {
        this.naam = naam;
    }

    /**
     * This methods prints a visual representation of all the its workers.
     * <p>
     * For all its workers it states their monthly income.
     * The list of workers is ordered alphabetically.
     * <p>
     * When a worker is a volunteer it gives a personal message.
     */
    public void printInkomsten() {

        //ToDo: Sort on alphabetical order
        Collections.sort(medewerkers);

        System.out.println("Inkomsten van alle personen:");

        for (Persoon persoon : medewerkers) {
            if (persoon.getClass().equals(Vrijwilliger.class)) {
                System.out.printf("\t%s: %s%n", persoon.toString(), "Bedankt voor uw bijdrage!");
            } else {
                System.out.printf("\t%s: %.2f%n", persoon.toString(), persoon.berekenInkomsten());
            }
        }
    }

    /**
     * This methods calculated the amount of managers in the company and returns the value
     *
     * @return the amount of managers present in the company
     */
    public int aantalManagers() {
        int aantalManagers = 0;

        for (Persoon persoon : medewerkers) {
            if (persoon instanceof Manager) {
                aantalManagers++;
            }
        }

        return aantalManagers;
    }

    /**
     * This method lets you add a person to the company.
     *
     * @param persoon the person to be added to the company. This persoon could be any type of worker.
     */
    public void neemInDienst(Persoon persoon) {
        this.medewerkers.add(persoon);
    }

    /**
     * This method gives a visual presentation of the company's size. It returns a formatted String containing the company's name and the amount of workers.
     * Furthermore it contains list if all workers present.
     *
     * @return String containg iformation about the company and its workers.
     */
    @Override
    public String toString() {
        Collections.sort(medewerkers);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Bedrijf %s heeft %d medewerkers%n", this.naam, this.medewerkers.size()));
        for (Persoon persoon : medewerkers) {
            stringBuilder.append(String.format("\t%s%n", persoon.toString()));
        }
        return stringBuilder.toString();
    }
}
