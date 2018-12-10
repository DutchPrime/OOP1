package modules;

/**
 * This class contains information and methods of a Veelhoek object
 *
 * @author Koen Lippe 500794493
 */

public class Veelhoek {
    //Variables
    private String naam;
    private char startLetter = 'A';
    private final int MINIMUM_AMOUNT_OF_POINTS = 3;
    private Punt[] puntenLijst;


    //Constructors

    /**
     * This contructor creates an instance of a Veelhoek     *
     *
     * @param naam The name of the Veelhoek
     */
    public Veelhoek(String naam) {
        this.naam = naam;
        puntenLijst = new Punt[MINIMUM_AMOUNT_OF_POINTS];
        for (int i = 0; i < MINIMUM_AMOUNT_OF_POINTS; i++) {
            puntenLijst[i] = new Punt(startLetter++);
        }

    }

    /**
     * This contructor creates an instance of a Veelhoek
     *
     * @param naam         The name of the Veelhoek
     * @param aantalPunten The amount of Punten in the Veelhoek
     */
    public Veelhoek(String naam, int aantalPunten) {
        this.naam = naam;
        if (aantalPunten < 3) {
            System.out.println("Het aantal punten is te weinig (minimaal 3)");
            System.out.println("Er wordt een veelhoek aangemaak met 3 punten...");
            //Is dit goed?
            Veelhoek veelhoek = new Veelhoek(naam);
        } else {
            puntenLijst = new Punt[aantalPunten];
            for (int i = 0; i < aantalPunten; i++) {
                puntenLijst[i] = new Punt(startLetter++);
            }
        }
    }


    //Methods

    /**
     * This method prints a visual representation containing the information of the Veelhoek object
     */
    public void print() {
        System.out.printf("De veelhoek %s, heeft %d punten: ", this.naam, this.puntenLijst.length);

        for (int i = 0; i < puntenLijst.length; i++) {
            System.out.print(puntenLijst[i].print() + " ");
        }
    }

    /**
     * This method sets the Punt inside of the Punten array
     *
     * @param index The index the punten array  to set the Punt
     * @param punt  The punt to replace the existing Punt with
     */
    public void setPunt(int index, Punt punt) {
        if (index >= 0 && index < puntenLijst.length) {
            //valid index
            puntenLijst[index] = punt;
        } else {
            //invalid index
            System.out.println("Invalid index");
        }
    }

    /**
     * This method will shift the full Veelhoek
     *
     * @param deltaX The amount to shift the x-axis with
     * @param deltaY The amount to shit the y-axis with
     */
    public void verschuif(int deltaX, int deltaY) {
        for (int i = 0; i < puntenLijst.length; i++) {
            puntenLijst[i].verschuif(deltaX, deltaY);
        }
    }

}
