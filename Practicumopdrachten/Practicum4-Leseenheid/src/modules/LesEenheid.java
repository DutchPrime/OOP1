package modules;

/**
 * This document contains information about LesEenheid class
 *
 * @author Koen Lippe 500794493
 */
public class LesEenheid {
    //Variables
    protected String naam;
    protected double ects;
    protected int studieJaar;
    protected static final int STANDARD_GRADE = -1;
    protected static final double ONDERGRENS_VOLDOENDE = 5.5;

    //Constructor

    /**
     * This constructor creates an instance of a LesEenheid class
     *
     * @param naam       The name of the LesEenheid
     * @param ects       The ect's to be rewarded when the project is succesfully completed
     * @param studieJaar The year in which this project will be present
     */
    public LesEenheid(String naam, double ects, int studieJaar) {
        this.naam = naam;
        this.ects = ects;
        this.studieJaar = studieJaar;
    }

    //Method

    /**
     * This methods creates an formatted String in which the LesEenheid's information is displayed
     *
     * @return formatted String which displatys LesEenheid's information.
     */
    @Override
    public String toString() {
        //Format: Algemeen, 3 ect's, studiejaar 2
        return String.format("%s, %.1f ects, studiejaar %d", this.naam, this.ects, this.studieJaar);
    }
}
