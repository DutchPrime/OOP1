package models;

/**
 * This class represents a product
 *
 * @author Koen Lippe 500794493
 */
public class Vuurpijl extends Vuurwerk {
    //Variables
    private double hoogte;
    private int[] kleurverhouding;

    private int[] STANDARD_COLOR = {100, 0, 0};

    //Constructors

    /**
     * This constructor creates an instance of Knaller
     *
     * @param naam            The name of the Vuurpijl
     * @param prijs           The price of the Vuurpijl
     * @param hoogte          The height the Vuurpijl goes into the air (in meters)
     * @param kleurverhouding the color of the vuurpijl (f.e. {100,0,0} --> {R,G,B}
     * @param instructie      The instruction that comes with the Vuurpijl
     */
    public Vuurpijl(String naam, double prijs, int hoogte, int[] kleurverhouding, Instructie instructie) {
        super(naam, prijs, instructie);
        this.hoogte = hoogte;

        if (correcteKleurverhouding(kleurverhouding)) {
            this.kleurverhouding = kleurverhouding;
        } else {
            System.out.println("-->Incorrecte kleurverhouding! Kleur wordt nu rood");
            this.kleurverhouding = STANDARD_COLOR;
        }
    }


    //Methods

    /**
     * This method checks if the color entered is correct
     *
     * @param kleurverhouding the color of the Vuurpijl
     * @return true of false statement indicating correctness of the color
     */
    public boolean correcteKleurverhouding(int[] kleurverhouding) {
        //Make a variable which totals the 3 values in kleurenverhouding
        int total = 0;
        for (int i = 0; i < kleurverhouding.length; i++) {
            total += kleurverhouding[i];
        }

        //Check if kleurverhoudings total = 100
        return total == 100;
    }


    /**
     * This method checks if the product is legal
     *
     * @return true or false statement indicating if Vuurpijl is legal
     */
    //TODO: Add logic to check if instruction says it is 16+
    @Override
    public boolean isLegaal() {
        return super.isLegaal() && this.getInstructie() != null && this.getInstructie().getLeeftijd() >= 16;
    }

    /**
     * This method gives a visual representation of the Vuurpijl's information
     * To be used to print out on the screen
     *
     * @return string containing information of the Vuurpijl
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(super.toString());
        stringBuilder.append(String.format("\tHoogte: %.1f%n", hoogte));
        stringBuilder.append(String.format("\tKleuren: %n"));

        stringBuilder.append(String.format("\t\tROOD: %d%%%n", kleurverhouding[0]));
        stringBuilder.append(String.format("\t\tGROEN: %d%%%n", kleurverhouding[1]));
        stringBuilder.append(String.format("\t\tBLAUW: %d%%%n", kleurverhouding[2]));


        return stringBuilder.toString();
    }
}
