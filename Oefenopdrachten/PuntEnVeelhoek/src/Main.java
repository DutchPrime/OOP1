import modules.Punt;
import modules.Veelhoek;

/**
 * This program lets you create Punten en Veelhoeken and show the information on the screen.
 * This program is programmed with Object Oriented programming.
 *
 * @author Koen Lippe 500794493
 */

public class Main {
    public static void main(String[] args) {

        Punt punt = new Punt('A');
        Punt punt1 = new Punt('B', 1, 3);
        Punt punt2 = new Punt('c', 5, 4);
        Punt punt3 = new Punt('d', 9, 2);

        System.out.println(punt.print());
        System.out.println(punt1.print());

        punt1.verschuif(4, -5);

        System.out.println(punt1.print());

        Veelhoek veelhoek = new Veelhoek("Veelhoek");
        Veelhoek veelhoek1 = new Veelhoek("Veelhoek1", 5);

        veelhoek.print();
        System.out.println();
        veelhoek1.print();

        System.out.println();

        veelhoek.setPunt(0, punt1);
        veelhoek.setPunt(1, punt2);
        veelhoek.setPunt(2, punt3);

        veelhoek.print();

        System.out.println();

        veelhoek.verschuif(2, 3);

        veelhoek.print();


    }
}
