package modules;

/**
 * Description
 *
 * @author Koen Lippe 500794493
 */

public class Manager extends Werknemer {
    //Variables
    private double bonus;

    //Constructor
    public Manager(double maandSalaris, String naam) {
        super(maandSalaris, naam);
    }

    //Methods
    public void kenBonusToe(double bonus){
        this.bonus = bonus;
    }

    @Override
    public double berekenInkomsten() {
        return super.berekenInkomsten() + bonus;
    }
}
