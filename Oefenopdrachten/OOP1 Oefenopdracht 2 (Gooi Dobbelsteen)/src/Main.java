import java.util.function.DoubleBinaryOperator;

/**
 * Description: A program that throws a dice and prints it in the ASCII form.
 *              This program is made with Object Oriented Programming *
 *
 * @author Koen Lippe (500794493)
 */

public class Main {

    public static void main(String[] args) {
        Dobbelsteen steen = new Dobbelsteen();

        boolean correct = false;
        while (!correct) {
            steen.gooi();
            steen.print();
            if (steen.worp == 6){
                correct = true;
            }

        }
    }
}
