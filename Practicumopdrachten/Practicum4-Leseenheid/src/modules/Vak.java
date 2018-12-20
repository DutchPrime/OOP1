package modules;

/**
 * This document contains information about the Vak class
 *
 * @author Koen Lippe 500794493
 */
public class Vak extends LesEenheid {

    //Variabes
    private double cijfer;

    //Constructors

    /**
     * This constructor creates an instance of Vak
     *
     * @param naam       The name of the LesEenheid (Vak)
     * @param ects       The ect's to be rewarded when the project is succesfully completed
     * @param studieJaar The year in which this project will be present
     * @param cijfer     The mark that is achieved for this subject
     */
    public Vak(String naam, double ects, int studieJaar, double cijfer) {
        super(naam, ects, studieJaar);
        this.cijfer = cijfer;
    }

    /**
     * This constructor creates an instance of Vak
     *
     * @param naam       The subject's name
     * @param ects       The ect's to be rewarded when the project is succesfully completed
     * @param studieJaar The year in which this project will be present
     */
    //    TIP: maak in de extra constructor handig gebruik van de bestaande constructor in dezelfde subklasse en roep deze aan. Schrijf zo min mogelijk dubbele code!
    public Vak(String naam, double ects, int studieJaar) {
        this(naam, ects, studieJaar, STANDARD_GRADE);
    }

    //Methods

    /**
     * This method sets the mark for this subject.
     *
     * @param cijfer the mark to be set for this subject
     */
    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }

    /**
     * This method returns a visual representation of the subject's details
     *
     * @return formatted String with the subject's details
     */
    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        temp.append(super.toString());
        temp.append(", cijfer ");
        temp.append(this.cijfer);
        return temp.toString();
    }

    /**
     * This method checks if the achieved mark is sufficient to pass the Vak
     *
     * @return true of false statement indicating if the Vak is passed
     */
    public boolean isAfgerond() {
        return this.cijfer >= ONDERGRENS_VOLDOENDE;
    }
}
