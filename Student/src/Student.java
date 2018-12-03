import java.time.LocalDate;

/**
 + Deze klasse bevat informatie en functies van een student object.
 *
 * @author Koen Lippe 500794493
 */

public class Student {
    private int studentnr;
    private String voornaam;
    private String achternaam;
    private LocalDate geboortedatum;
    private Adres adres;

    public Student(
            int studentnr,
            String voornaam,
            String achternaam,
            LocalDate geboortedatum,
            Adres adres
    ) {
        this.studentnr = studentnr;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geboortedatum = geboortedatum;
        this.adres = adres;
    }

    public String toString(){
        return null;
    }

}
