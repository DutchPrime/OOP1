package modules;

/**
 *
 *
 * @author Koen Lippe 500794493
 */

public class Punt {
    //Variables
    private char naam;
    private int x;
    private int y;

    private final int STANDARD_POSITION = 0;

    //Constructors
    public Punt(char naam){
        this.naam = naam;
        x = STANDARD_POSITION;
        y = STANDARD_POSITION;
    }

    public Punt(char naam, int x, int y){
        this(naam);
        this.x = x;
        this.y = y;
    }


    //Methods
    public String print(){
        return String.format("%s(%d, %d)", naam, x, y);
    }

    public void verschuif(int deltaX, int deltaY){
        this.x += deltaX;
        this.y += deltaY;
    }

}
