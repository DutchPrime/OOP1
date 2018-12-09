import java.time.LocalDate;
import java.util.Scanner;

/**
 * This program lets you create a class and add students to them. Programmed with an Object Oriented implementation.
 *
 * @author Koen Lippe 500794493
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef de naam van de klas op: ");
        Klas klas = new Klas(scanner.nextLine());

        int studentnr = 0;
        do {

            System.out.println();
            System.out.println("STUDENT TOEVOEGEN (vul 0 in bij studentnummer om af te sluiten)");
            //Ask user for student information
            System.out.print("Wat is het studentnumer? ");
            studentnr = scanner.nextInt();
            scanner.nextLine();

            //Checking if studentnr = 0 or max students is reached, if so: break out of loop
            if (studentnr == 0) {
                break;
            } else if (klas.getAantalStudenten() == klas.MAX_STUDENTS) {
                break;
            }

            //Splitting naam into firstname, lastname
            System.out.print("Wat is de volledige naam van de student? ");
            String naam = scanner.nextLine();

            String[] naamArray = naam.split(" ");
            String voornaam = naamArray[0];
            String achternaam = naamArray[1];


            //Using LocalDate to make a date
            System.out.print("Wat is de geboortedatum van de student? (Graag invullen met '/') ");
            String gebdatumInput = scanner.nextLine();
            String[] parts = gebdatumInput.split("/");

            int dag = Integer.parseInt(parts[0]);
            int maand = Integer.parseInt(parts[1]);
            int jaar = Integer.parseInt(parts[2]);

            LocalDate gebdatum = LocalDate.of(jaar, maand, dag);

            //Asking the user for adres
            System.out.print("Wat is het adres van de student? (Vul dit als volgt in: Straat Huisnummer Postcode Plaats) ");
            String adresString = scanner.nextLine();

            //Turning user input into varibales to be added in an Adres object
            String[] adresArray = adresString.split(" ");
            String straat = adresArray[0];
            int huisnr = Integer.parseInt(adresArray[1]);
            String postcode = adresArray[2];


            //Check if postcode is valid. (Assignment does not ask to print it or ask for repeated input)
            boolean valid = Adres.checkPostcode(postcode);

            //Still turning user input into variables to be added in an Adres object
            String plaats = adresArray[3];


            //Creating Adres and student object
            Adres adres = new Adres(straat, huisnr, postcode, plaats);
            Student student = new Student(studentnr, voornaam, achternaam, gebdatum, adres);


            //Adding student in Klas and giving user completion message
            klas.voegStudentToe(student);
            System.out.println("Student toegevoegd!");


        } while (studentnr != 0);


        System.out.println(klas.toString());


    }
}
