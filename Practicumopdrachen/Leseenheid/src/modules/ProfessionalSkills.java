package modules;

/**
 * This document contains information of the ProfessionalSkills class
 *
 * @author Koen Lippe 500794493
 */
public class ProfessionalSkills extends LesEenheid {

    //Variables
    private boolean gehaald;
    private final static boolean STANDARD_GEHAALD = false;

    //Constructors

    /**
     * This constructor creates an instance of ProfessionalSkills
     *
     * @param naam       The name of the LesEenheid (ProfessionalSkills)
     * @param ects       The ect's to be rewarded when the project is succesfully completed
     * @param studieJaar The year in which this project will be present
     * @param gehaald    true of false statement which indicates if the student has passed
     */
    public ProfessionalSkills(String naam, int ects, int studieJaar, boolean gehaald) {
        super(naam, ects, studieJaar);
        this.gehaald = gehaald;
    }

    /**
     * This constructor creates an instance of ProfessionalSkills.
     * It calls the standard constructor and sets gehaald to a default
     *
     * @param naam       The name of the LesEenheid (ProfessionalSkills)
     * @param ects       The ect's to be rewarded when the project is succesfully completed
     * @param studieJaar The year in which this project will be present
     */
    public ProfessionalSkills(String naam, int ects, int studieJaar) {
        this(naam, ects, studieJaar, STANDARD_GEHAALD);
    }

    //Methods

    /**
     * This method returns the object's gehaald variable
     *
     * @param gehaald true or false statement indicating if ProfessionalSkills is passed
     */
    public void setGehaald(boolean gehaald) {
        this.gehaald = gehaald;
    }

    /**
     * This method creates a formatted String in which the ProfessionalSkills information is displayed
     *
     * @return formatted String which contains ProfessionalSkills information
     */
    @Override
    public String toString() {
        return String.format("%s, gehaald %b", super.toString(), this.gehaald);
    }

    /**
     * Evalutes if ProfessionalSkills is passed and returns it.
     *
     * @return true of false statement indicating if ProffessionalSkills is passed
     */
    public boolean isAfgerond() {
        if (this.gehaald) {
            return true;
        }

        return false;
    }
}
