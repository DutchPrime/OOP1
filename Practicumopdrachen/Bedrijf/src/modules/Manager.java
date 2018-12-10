package modules;

public class Manager extends Werknemer {
    //Variables
    private double bonus;

    //Constructors
    public Manager(double maandsalaris, String naam){
        super(maandsalaris, naam);
    }

    //Methods
    public void kenBonusToe(double bonus){
        this.bonus = bonus;
    }

    @Override
    public double berekenInkomsten() {
        return 0;
    }
}
