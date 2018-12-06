/**
 * Deze klasse bevat informatie en methods van een klas object
 *
 * @author Koen Lippe 500794493
 */

public class Klas {
    //Variables
    public final int MAX_STUDENTS = 30;
    private String naam;
    private int aantalStudenten;
    private Student[] studenten;

    //Constructor

    /**
     * This constructor creates an instance of Klas
     *
     * @param naam The class name
     */
    public Klas(String naam){
        this.naam = naam;
        this.aantalStudenten = 0;
        this.studenten = new Student[MAX_STUDENTS];
    }

    //Methods

    /**
     * This method adds a student to the Klas object
     *
     * @param student The student that needs to be added
     * @return true of false indicating correct completion of the method
     */
    public boolean voegStudentToe(Student student){
        if (this.aantalStudenten == MAX_STUDENTS) {
            return false;
        }
        else{
            this.studenten[aantalStudenten] = student;
            this.aantalStudenten++;
            return true;
        }
    }

    /**
     *  This method returns the amount of students that are present in the Klas object.
     *
     * @return integer of the amount of students in the class
     */
    public int getAantalStudenten() {
        return this.aantalStudenten;
    }

    /**
     * This method returns a formatted String representation of the class and its containing students
     *
     * @return Formatted String containing class name and its containing students
     */
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(String.format("%nKlas %s (%d studenten)%n%n", this.naam, this.aantalStudenten));

        for (int i = 0; i < aantalStudenten; i++) {
            stringBuilder.append(studenten[i].toString());
        }

        return stringBuilder.toString();
    }
}
