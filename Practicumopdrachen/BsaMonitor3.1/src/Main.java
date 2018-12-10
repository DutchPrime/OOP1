import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * This is the full version of the BSAMonitor implemented with Object Oriented Programming
 *
 * @author Koen Lippe 500794493
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vak[] vakken = new Vak[6];
        vakken[0] = new Vak("Fasten Your Seatbelts", 12);
        vakken[1] = new Vak("Fasten Your Seatbelts", 12);
        vakken[2] = new Vak("Fasten Your Seatbelts", 12);
        vakken[3] = new Vak("Fasten Your Seatbelts", 12);
        vakken[4] = new Vak("Fasten Your Seatbelts", 12);
        vakken[5] = new Vak("Fasten Your Seatbelts", 12);

        //Couting up the max attainable points.
        int maxPoints = 0;
        for (int i = 0; i < vakken.length; i++) {
            maxPoints += vakken[i].getPunten();
        }


        //Asking the user for their grades
        System.out.println("Voer behaalde cijfers in");
        for (int i = 0; i < vakken.length; i++) {
            System.out.printf("%s: ", vakken[i].getNaam());
            vakken[i].setCijfer(scanner.nextDouble());
        }

        System.out.println();
        //Printing information in a table
        for (int i = 0; i < vakken.length;  i++) {
            System.out.printf("Vak/Project: %-30s Cijfer: %-10.1f Behaalde Punten: %d%n",
                    vakken[i].getNaam(),
                    vakken[i].getCijfer(),
                    vakken[i].gehaaldePunten()
            );
        }

        //Printing (total points)/(max points)
        int totalPunten = 0;
        for (int i = 0; i < vakken.length; i++) {
            totalPunten += vakken[i].gehaaldePunten();
        }

        System.out.println();

        System.out.printf("Totaal behaalde studiepunten: %d/%d%n", totalPunten, maxPoints);

        //Printing BSA advies
        if((totalPunten/maxPoints) < 5/6f){
            System.out.println("PAS OP: je ligt op schema voor een negatief BSA!");
        }

    }


}

