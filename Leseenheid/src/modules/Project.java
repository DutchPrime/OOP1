package modules;

/**
 * This class represents a Product
 *
 * @author Koen Lippe 500794493
 */


public class Project extends LesEenheid {

    //Variables */
    private double productCijfer;
    private double procesCijfer;
    private double methodenEnTechniekenCijfer;

    //Constructor

    /**
     * This constructor creates an instance of a Project
     *
     * @param naam                       The name of the LesEenheid (Project)
     * @param ects                       The ect's to be rewarded when the project is succesfully completed
     * @param studieJaar                 The year in which this project will be present
     * @param productCijfer              Mark that is achieved for the product
     * @param procesCijfer               Mark that is achieved for the proces
     * @param methodenEnTechniekenCijfer Mark that is achieved for methoden en technieken
     */
    public Project(String naam, int ects, int studieJaar, double productCijfer, double procesCijfer, double methodenEnTechniekenCijfer) {
        super(naam, ects, studieJaar);
        this.productCijfer = productCijfer;
        this.procesCijfer = procesCijfer;
        this.methodenEnTechniekenCijfer = methodenEnTechniekenCijfer;
    }

    /**
     * This constructor creates an instance of Project
     *
     * @param naam       The name of the LesEenheid (Project)
     * @param ects       The ect's to be rewarded when the project is succesfully completed
     * @param studieJaar The year in which this project will be present
     */
    public Project(String naam, int ects, int studieJaar) {
        this(naam, ects, studieJaar, STANDARD_GRADE, STANDARD_GRADE, STANDARD_GRADE);
    }

    //Methods

    /**
     * Sets the object's productCijfer
     *
     * @param productCijfer The mark rewarded for product
     */
    public void setProductcijfer(double productCijfer) {
        this.productCijfer = productCijfer;
    }

    /**
     * Sets the object's product cijfer
     *
     * @param procesCijfer The mark rewarded for product
     */
    public void setProcescijfer(double procesCijfer) {
        this.procesCijfer = procesCijfer;
    }

    /**
     * Sets the object's methoden en technieken cijfer
     *
     * @param methodenEnTechniekenCijfer The mark rewarded for the methoden en technieken
     */
    public void setMethodenEnTechniekenCijfer(double methodenEnTechniekenCijfer) {
        this.methodenEnTechniekenCijfer = methodenEnTechniekenCijfer;
    }

    /**
     * Gives a visual representation of the project details.
     * Format: Name, x ect's, studiejaar x, (mark, mark, mark)
     *
     * @return formatted string with project details
     */
    @Override
    public String toString() {
        //Format: Algemeen, 3 ect's, studiejaar 2 (7,0 7,0 7,0)
        return String.format("%s, (%.1f %.1f %.1f)",
                super.toString(),
                this.productCijfer,
                this.procesCijfer,
                this.methodenEnTechniekenCijfer);
    }

    /**
     * This method checks if the marks achieved are sufficient.
     *
     * @return true of false statement which indicates if the project is succesfully passed or not
     */
    public boolean isAfgerond() {
        return this.procesCijfer >= ONDERGRENS_VOLDOENDE &&
                this.productCijfer >= ONDERGRENS_VOLDOENDE &&
                this.methodenEnTechniekenCijfer >= ONDERGRENS_VOLDOENDE;
    }
}
