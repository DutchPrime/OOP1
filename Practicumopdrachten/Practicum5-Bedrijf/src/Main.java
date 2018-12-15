import modules.*;

/**
 * @author Koen Lippe 500794493
 *
 *
 * ToDo:
 *       Sort on alphabetical order
 *       Personal message for volunteers
 *       Add javadoc
 */

public class Main {

    public static void main(String[] args) {
//        Collections.sort();
        Bedrijf bedrijf = new Bedrijf("HvA");

        Werknemer w = new Werknemer(1200, "Jantine Jansen");
        bedrijf.neemInDienst(w);

        Werknemer a = new Werknemer(1300, "Piet Pietersen");
        bedrijf.neemInDienst(a);

        Vrijwilliger v = new Vrijwilliger("Guus Goedhart");
        bedrijf.neemInDienst(v);
        v.huurIn(10);

        Manager m = new Manager(10000, "Brigitte Baas");
        bedrijf.neemInDienst(m);
        m.kenBonusToe(750);

        Manager k = new Manager(10000, "Dirk Teur");
        bedrijf.neemInDienst(k);
        k.kenBonusToe(1200);

        Zzper z = new Zzper(120, "Beun Haas");
        bedrijf.neemInDienst(z);
        z.huurIn(40);

        System.out.println(bedrijf);
        bedrijf.printInkomsten();
        System.out.println("\nAantal in management: " + bedrijf.aantalManagers());
    }
}
