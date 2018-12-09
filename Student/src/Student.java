import java.time.LocalDate;

/**
 * + Deze klasse bevat informatie en functies van een student object.
 *
 * @author Koen Lippe 500794493
 */

public class Student {
    private int studentnr;
    private String voornaam;
    private String achternaam;
    private LocalDate geboortedatum;
    private Adres adres;

    /**
     * This constructor creates an instance of an Student
     *
     * @param studentnr     The number associated with the student
     * @param voornaam      The student's first name
     * @param achternaam    The student's last name
     * @param geboortedatum The student's date of birth
     * @param adres         The address of the student
     */
    public Student(int studentnr, String voornaam, String achternaam, LocalDate geboortedatum, Adres adres) {
        this.studentnr = studentnr;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geboortedatum = geboortedatum;
        this.adres = adres;
    }


    /**
     * This methods returns a formatted String containing the student's information
     *
     * @return Formatted String with Student information
     */
    public String toString() {
        return String.format("%d %s %s (%s)%nAdres: %s%n",
                this.studentnr,
                this.voornaam,
                this.achternaam,
                korteGeboortedatum(),
                adres.toString()
        );
    }

    /**
     * This method returns a formatted String containg date of birth information
     *
     * @return a short version (formatted String) of the date of the Student
     */
    private String korteGeboortedatum() {
        return String.format("%d-%d-%d",
                geboortedatum.getDayOfMonth(),
                geboortedatum.getMonthValue(),
                geboortedatum.getYear());
    }
}
