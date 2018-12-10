package modules;

/**
 * This class contians information and methods of a Punt object.
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

    /**
     * This contructor creates an instance of a Punt
     *
     * @param naam The name of the Punt
     */
    public Punt(char naam) {
        this.naam = naam;
        x = STANDARD_POSITION;
        y = STANDARD_POSITION;
    }

    /**
     * This contructor creates an instance of a Punt
     *
     * @param naam The name of the Punt
     * @param x    The x-coordinate of the Punt
     * @param y    The y-coordinate of the Punt
     */
    public Punt(char naam, int x, int y) {
        this(naam);
        this.x = x;
        this.y = y;
    }


    //Methods

    /**
     * This method returns information of the Punt object.
     *
     * @return Formatted String with the information of the Punt object
     */
    public String print() {
        return String.format("%s(%d, %d)", naam, x, y);
    }


    /**
     * This method changes the x and y coordinate of the Punt object by a deltaX and deltaY
     *
     * @param deltaX The number in which the x-coordinate will change. A negative number will push the Punt down, while a positive number will change it upwards
     * @param deltaY The number in which the y-coordinate will change. A negative number will push the Punt to the left, while a positive number will change it to the right.
     */
    public void verschuif(int deltaX, int deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

}
