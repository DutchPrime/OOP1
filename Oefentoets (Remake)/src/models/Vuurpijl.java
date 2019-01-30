package models;

public class Vuurpijl extends Vuurwerk {
    //Variables
    private double hoogte;
    private int[] kleurverhouding;
    private final int MAX_KLEURVERHOUDING = 100;
    private final int[] STANDARD_COLOR = {100, 0, 0};
    private final int MINIMUM_AGE = 16;

    //Constructor
    public Vuurpijl(String naam, double prijs, double hoogte, int[] kleurverhouding, Instructie instructie) {
        super(naam, prijs, instructie);
        this.hoogte = hoogte;

        if (correcteKleurverhouding(kleurverhouding)) {
            this.kleurverhouding = kleurverhouding;
        } else {
            System.out.println("--> FOUT: Onjuiste kleurverhouding, kleur wordt rood");
            this.kleurverhouding = STANDARD_COLOR;
        }


    }

    @Override
    public boolean isLegaal() {
        return super.isLegaal() && super.getInstructie().getLeeftijd() >= MINIMUM_AGE;
    }

    private boolean correcteKleurverhouding(int[] kleurverhouding) {
        int total = 0;
        for (int i = 0; i < kleurverhouding.length; i++) {
            total += kleurverhouding[i];
        }

        return total == MAX_KLEURVERHOUDING;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append(super.toString());
        s.append(String.format("\tHoogte: %.1f meter%n", hoogte));
        s.append("\tKleuren:\n");
        s.append(String.format("\t\tROOD: %d%%%n", kleurverhouding[0]));
        s.append(String.format("\t\tGROEN: %d%%%n", kleurverhouding[1]));
        s.append(String.format("\t\tBLAUW: %d%%%n", kleurverhouding[2]));

        return s.toString();
    }
}
