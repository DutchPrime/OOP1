/**
 * Deze klasse bevat informatie en methods van een klas object
 *
 * @author Koen Lippe 500794493
 */

public class Klas {
    //Variables
    private String naam;
    private int aantalStudenten;
    private Student[] studenten;

    //Constructor
    public Klas(String naam){
        this.naam = naam;
    }

    //Methods
    public boolean voegStudentToe(Student student){
        return false;
    }

    public int getAantalStudenten() {
        return this.aantalStudenten;
    }

    public String toString(){
        return null;
    }
}
