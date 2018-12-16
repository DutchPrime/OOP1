import modules.*;


/**
 * @author Koen Lippe 500794493
 * <p>
 * This program creates a company and adds workers to it. Furthermore is displays the workers and their monthly salary.
 * Volunteers and freelancers can also be added.
 * <p>
 * This program is made to practice with Object Oriented programing
 */

public class Main {

    public static void main(String[] args) {
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
