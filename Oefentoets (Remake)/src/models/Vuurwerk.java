package models;


/**
 * Description:
 *
 * @author Koen Lippe 500794493
 */

public class Vuurwerk extends Product {
    //Variables
    private Instructie instructie;

    //Constructor
    public Vuurwerk(String naam, double prijs) {
        super(naam, prijs);
    }

    public Vuurwerk(String naam, double prijs, Instructie instructie) {
        this(naam, prijs);
        this.instructie = instructie;
    }

    //Methods
    public Instructie getInstructie() {
        return instructie;
    }

    @Override
    public boolean isLegaal() {
        if (instructie != null) {
            return instructie.isNederlandstalig();
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append(super.toString());

        if (instructie != null) {
            s.append(String.format("\tInstructie: %s%n", this.instructie));
        } else {
            s.append("\tInstructie: ontbreekt\n");
        }

        s.append(String.format("\tLegaal: %b%n", isLegaal()));

        return s.toString();
    }
}
