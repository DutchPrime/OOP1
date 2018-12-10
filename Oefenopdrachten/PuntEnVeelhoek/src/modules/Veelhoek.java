package modules;

/**
 * @author Koen Lippe 500794493
 */

public class Veelhoek {
    //Variables
    private String naam;
    private char startLetter = 'A';
    private final int MINIMUM_AMOUNT_OF_POINTS = 3;
    private Punt[] puntenLijst;


    //Constructors
    public Veelhoek(String naam) {
        this.naam = naam;
        puntenLijst = new Punt[MINIMUM_AMOUNT_OF_POINTS];
        for (int i = 0; i < MINIMUM_AMOUNT_OF_POINTS; i++) {
            puntenLijst[i] = new Punt(startLetter++);
        }

    }

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
    public void print(){
        System.out.printf("De veelhoek %s, heeft %d punten: ", this.naam, this.puntenLijst.length);

        for (int i = 0; i < puntenLijst.length; i++) {
            System.out.print(puntenLijst[i].print() + " ");
        }
    }

    public void setPunt(int index, Punt punt){
        if (index >= 0 && index < puntenLijst.length){
            //valid index
            puntenLijst[index] = punt;
        }
        else{
            //invalid index
            System.out.println("Invalid index");
        }
    }

    public void verschuif(int deltaX, int deltaY){
        for (int i = 0; i < puntenLijst.length; i++) {
            puntenLijst[i].verschuif(deltaX, deltaY);
        }
    }

}
