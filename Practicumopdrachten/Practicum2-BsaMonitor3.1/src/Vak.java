/**
 * Description:
 *
 * @author Koen Lippe (500794493)
 *
 */

public class Vak {
    //Variables
    private String naam;
    private int punten;
    private double cijfer;

    //Constructor
    public Vak(String naam, int punten){
        this.naam = naam;
        this.punten = punten;
    }



    //Methods
    public String getNaam(){
        return this.naam;
    }

    public int getPunten(){
        return punten;
    }

    public double getCijfer(){
        return this.cijfer;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }

    public int gehaaldePunten(){
        if(this.cijfer > 5.5){
            return this.punten;
        }
        else {
            this.punten = 0;
            return 0;
        }
    }

}
